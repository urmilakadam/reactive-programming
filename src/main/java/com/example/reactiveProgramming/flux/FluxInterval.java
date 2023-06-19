package com.example.reactiveProgramming.flux;

import com.example.reactiveProgramming.util.Subscriber;
import reactor.core.publisher.Flux;

import java.time.Duration;

public class FluxInterval {

    public static void main(String[] args) {

        Flux.interval(Duration.ofSeconds(1))
                .subscribe(Subscriber.onNext());

        Subscriber.sleepSecond(5);

    }

}
