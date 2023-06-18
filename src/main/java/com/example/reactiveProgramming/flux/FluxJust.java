package com.example.reactiveProgramming.flux;

import com.example.reactiveProgramming.util.Subscriber;
import reactor.core.publisher.Flux;

public class FluxJust {
    public static void main(String[] args) {
        Flux<Integer> just = Flux.just(1, 2, 3, 4, 5, 6);
        just.subscribe(
                Subscriber.onNext(),
                Subscriber.onError(),
                Subscriber.onComplete()
        );
    }
}
