package com.example.reactiveProgramming.mono;

import com.example.reactiveProgramming.util.Subscriber;
import reactor.core.publisher.Mono;

public class MonoSubscribe {

    public static void main(String[] args) {
        Mono<String> just = Mono.just("TEST1").map(String::toLowerCase);

        just.subscribe(
                Subscriber.onNext(),  // Consumer for each element
                Subscriber.onError(),     // Error handler
                Subscriber.onComplete()
        );

        Mono<Integer> mono = Mono.just("test")
                .map(String::length)
                .map(l-> l/0);

        mono.subscribe(
                Subscriber.onNext(),  // Consumer for each element
                Subscriber.onError(),     // Error handler
                Subscriber.onComplete()
        );
    }
}
