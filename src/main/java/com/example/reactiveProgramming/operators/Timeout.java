package com.example.reactiveProgramming.operators;

import com.example.reactiveProgramming.util.Subscriber;
import reactor.core.publisher.Flux;

import java.time.Duration;

public class Timeout {

    public static void main(String[] args) {

        getOrderNumbers()
                .timeout(Duration.ofSeconds(2), fallback())
                .subscribe(Subscriber.subscriber());

        Subscriber.sleepSecond(60);
    }

    private static Flux<Integer> getOrderNumbers(){
        return Flux.range(1, 10)
                .delayElements(Duration.ofSeconds(5));
    }

    private static Flux<Integer> fallback(){
        return Flux.range(100, 10)
                .delayElements(Duration.ofSeconds(1));
    }

}
