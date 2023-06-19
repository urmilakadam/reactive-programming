package com.example.reactiveProgramming.util;

import com.github.javafaker.Faker;

import java.util.function.Consumer;

public class Subscriber {

    private static final Faker FAKER_INSTANCE = Faker.instance();

    public static Consumer<Object> onNext(){
        return  o -> System.out.println("Received: " + o);
    }

    public static Consumer<Throwable> onError(){
        return  e -> System.out.println("Error: " +e.getMessage());
    }

    public static Runnable onComplete(){
        return () -> System.out.println("Completed");
    }

    public static Faker faker(){
        return FAKER_INSTANCE;
    }

    public static void sleepSecond(long sec){
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static org.reactivestreams.Subscriber<Object> subscriber(){
        return new DefaultSubscriber();
    }

    public static org.reactivestreams.Subscriber<Object> subscriber(String name){
        return new DefaultSubscriber(name);
    }
}
