package com.example.reactiveProgramming.healper;

import com.example.reactiveProgramming.util.Subscriber;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

public class NameGenerator {

    public static List<String> getNames(int count) {
        List<String> list = new ArrayList<>();
        for (int i=0; i<count; i++) {
            list.add(getNames());
        }
        return list;
    }

    public static String getNames() {
        Subscriber.sleepSecond(1);
       return Subscriber.faker().name().fullName();
    }

    public static Flux<String> getName() {
        Subscriber.sleepSecond(1);

        return Flux.range(0, 5)
                .map(i-> getNames());

    }
}
