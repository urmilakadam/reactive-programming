package com.example.reactiveProgramming.mono;

import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import java.time.Duration;

import static com.example.reactiveProgramming.util.Subscriber.faker;
import static com.example.reactiveProgramming.util.Subscriber.sleepSecond;

public class SupplierRefactoring {

    public static void main(String[] args) {
        getName();
        String name = getName()
                .subscribeOn(Schedulers.boundedElastic())
                .block(Duration.ofSeconds(5));
        System.out.println(name);
        getName();

        //sleepSecond(4);
    }

    private static Mono<String> getName(){
        System.out.println("Entered getName method");
        return Mono.fromSupplier(()->{
            sleepSecond(3);
            return faker().name().fullName();
        }).map(String::toUpperCase);
    }
}
