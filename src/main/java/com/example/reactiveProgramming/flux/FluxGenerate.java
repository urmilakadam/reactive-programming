package com.example.reactiveProgramming.flux;

import com.example.reactiveProgramming.util.Subscriber;
import reactor.core.publisher.Flux;

public class FluxGenerate {

    public static void main(String[] args) {
        Flux.generate(synchronousSink -> {
                    String country = Subscriber.faker().country().name();
                    synchronousSink.next(country);

            if(country.equalsIgnoreCase("india"))
                synchronousSink.complete();
        })
    .subscribe(Subscriber.subscriber());
    }
}
