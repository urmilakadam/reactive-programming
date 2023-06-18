package com.example.reactiveProgramming.flux;

import com.example.reactiveProgramming.util.Subscriber;
import reactor.core.publisher.Flux;

import java.util.List;

public class FluxFromArrayOrList {

    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c", "d");
        Flux.fromIterable(list).subscribe(Subscriber.onNext());

        Integer[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Flux.fromArray(array).filter(i->i%2 ==0).subscribe(Subscriber.onNext());
    }
}
