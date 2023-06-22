package com.example.reactiveProgramming.operators;

import com.example.reactiveProgramming.util.Subscriber;
import reactor.core.publisher.Flux;

import java.time.Duration;

public class Delay {

    public static void main(String[] args) {
        Flux.range(1, 100)
                .log()
                .delayElements(Duration.ofSeconds(1))
                .subscribe(Subscriber.subscriber());

        Subscriber.sleepSecond(30);
    }
}
