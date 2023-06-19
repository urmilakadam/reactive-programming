package com.example.reactiveProgramming.flux;

import com.example.reactiveProgramming.healper.NameGenerator;
import com.example.reactiveProgramming.util.Subscriber;

import java.util.List;

public class FluxVsList {

    public static void main(String[] args) throws InterruptedException {

        List<String> list = NameGenerator.getNames(5);
        System.out.println(list);

        NameGenerator.getName().subscribe(Subscriber.onNext());


    }
}
