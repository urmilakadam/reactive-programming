package com.example.reactiveProgramming.flux;

import com.example.reactiveProgramming.util.Subscriber;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FluxFromArrayOrList {

    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c", "d");
        Flux.fromIterable(list).subscribe(Subscriber.onNext());

        Integer[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Flux.fromArray(array).filter(i->i%2 ==0).subscribe(Subscriber.onNext());

        Stream<Integer> stream = Arrays.stream(array);
        Flux.fromStream(stream).filter(i->i%2 ==0).subscribe(Subscriber.onNext());

        Flux.range(1, 10)
                .map(i-> Subscriber.faker().name().fullName())
                .subscribe(Subscriber.onNext());
    }
}
