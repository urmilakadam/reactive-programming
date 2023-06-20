package com.example.reactiveProgramming.operators;

import com.example.reactiveProgramming.util.Subscriber;
import reactor.core.publisher.Flux;

public class Handle {

    public static void main(String[] args) {

        Flux.range(1,10)
                .handle((integer, synchronousSink)->{
                    if(integer % 2 == 0)
                        synchronousSink.next(integer); //filter
                    else
                        synchronousSink.next(integer+ "a"); //map
                }).subscribe(Subscriber.subscriber());
    }
}
