package com.example.reactiveProgramming.mono;

import reactor.core.publisher.Mono;

public class MonoSubscribe {

    public static void main(String[] args) {
        Mono<String> just = Mono.just("TEST1").map(String::toLowerCase);

        just.subscribe(
                next -> System.out.println("Received: " + next),  // Consumer for each element
                error -> System.err.println("Error: " + error),     // Error handler
                () -> System.out.println("Completed")
        );

        Mono<Integer> mono = Mono.just("test")
                .map(String::length)
                .map(l-> l/0);

        mono.subscribe(
                next -> System.out.println("Received: " + next),  // Consumer for each element
                error -> System.err.println("Error: " + error.getMessage()),     // Error handler
                () -> System.out.println("Completed")
        );
    }
}