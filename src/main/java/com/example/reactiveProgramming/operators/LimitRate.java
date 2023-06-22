package com.example.reactiveProgramming.operators;

import com.example.reactiveProgramming.util.Subscriber;
import reactor.core.publisher.Flux;

public class LimitRate {

    public static void main(String[] args) {
        Flux.range(1, 200)
                .log()
                .limitRate(100, 80)
                .subscribe(Subscriber.subscriber());
    }
}
