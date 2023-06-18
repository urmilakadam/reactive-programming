package com.example.reactiveProgramming.mono;

import com.example.reactiveProgramming.util.Subscriber;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;

public class MonoFromFuture {

    public static void main(String[] args) {

        Mono<String> stringMono = Mono.fromFuture(getName());
        stringMono.subscribe(Subscriber.onNext());

        Subscriber.sleepSecond(2);

        Mono.fromRunnable(getFullName()).subscribe(
                Subscriber.onNext(),
                Subscriber.onError(),
                () -> System.out.println("Sent an Email")
        );

    }

    public static CompletableFuture<String> getName(){
        System.out.println("generating name");
        return CompletableFuture.supplyAsync(()-> Subscriber.faker().name().username());
    }

    public static Runnable getFullName(){
        return () -> {
            Subscriber.sleepSecond(2);
            System.out.println("Operation Completed");
        };
    }
}
