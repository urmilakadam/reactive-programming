package com.example.reactiveProgramming.mono;

import com.example.reactiveProgramming.util.Subscriber;
import reactor.core.publisher.Mono;

public class MonoFromSubscriber {

    public static void main(String[] args) {

        //call just only if you have data already
        Mono<String> just = Mono.just(getName());

        //it will call method only if we subscribe it (lazy evaluate).
        Mono<String> stringMono = Mono.fromSupplier(() -> getName());
        stringMono.subscribe(
                Subscriber.onNext(),
                Subscriber.onError(),
                Subscriber.onComplete()
        );
    }

    public static String getName(){
        System.out.println("generating name");
        return Subscriber.faker().name().username();
    }
}
