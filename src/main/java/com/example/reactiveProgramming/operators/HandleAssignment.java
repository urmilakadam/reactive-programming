package com.example.reactiveProgramming.operators;

import com.example.reactiveProgramming.util.Subscriber;
import reactor.core.publisher.Flux;

public class HandleAssignment {

    public static void main(String[] args) {
        Flux.generate(synchronousSink -> synchronousSink.next(Subscriber.faker().country().name()))
                .map(Object::toString)
                .handle((s, synchronousSink)->{
                    synchronousSink.next(s);
                    if(s.equalsIgnoreCase("india"))
                        synchronousSink.complete();
                })
                .subscribe(Subscriber.subscriber());
    }
}
