package com.example.reactiveProgramming.mono;

import com.example.reactiveProgramming.util.Subscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoToFlux {

    public static void main(String[] args) {

        Mono<Integer> mono = Mono.just(2);

        Flux<Integer> flux = Flux.from(mono);

        flux.subscribe(Subscriber.onNext());
    }
}
