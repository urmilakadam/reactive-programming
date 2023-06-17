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
    }
}
