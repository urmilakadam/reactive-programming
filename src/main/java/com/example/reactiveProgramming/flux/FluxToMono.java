package com.example.reactiveProgramming.flux;

import com.example.reactiveProgramming.util.Subscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class FluxToMono {

    public static void main(String[] args) {

        Mono<Integer> next = Flux.range(1, 10)
                .next();

        next.subscribe(Subscriber.onNext());

    }
}
