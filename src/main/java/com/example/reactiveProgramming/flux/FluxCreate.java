package com.example.reactiveProgramming.flux;

import com.example.reactiveProgramming.util.Subscriber;
import reactor.core.publisher.Flux;

public class FluxCreate {

    public static void main(String[] args) {
        Flux.create(fluxSink -> {
            String country;
            do{
                country = Subscriber.faker().country().name();
                fluxSink.next(country);
            }while(!country.equalsIgnoreCase("india"));

            fluxSink.complete();
        }).subscribe(Subscriber.subscriber());
    }
}
