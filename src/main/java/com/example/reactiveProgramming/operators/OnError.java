package com.example.reactiveProgramming.operators;

import com.example.reactiveProgramming.util.Subscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class OnError {

    public static void main(String[] args) {

        Flux.range(1,10)
                .log()
                .map(i-> 10/ (5-i))
                //.onErrorReturn(-1)
                //.onErrorResume(error -> fallback())
                .onErrorContinue((error, obj)->{System.out.println("Error: " + error + "Object: " +obj);})
                .subscribe(Subscriber.subscriber());
    }

    private static Mono<Integer> fallback(){
        return Mono.fromSupplier(()->Subscriber.faker().random().nextInt(100,200));
    }
}
