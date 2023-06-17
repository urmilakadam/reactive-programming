package com.example.reactiveProgramming.mono;

import reactor.core.publisher.Mono;

public class MonoJust {
    public static void main(String[] args) {
        Mono<Integer> just = Mono.just(2);

        System.out.println(just);

        //just like stream it is also lazy loaded so need to subscribe it.
        just.subscribe(i-> System.out.println("Received: "+ i));
    }
}
