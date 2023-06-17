package com.example.reactiveProgramming.stream;

import java.util.stream.Stream;

public class LazyStream {

    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.of(2).map(i -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return i * 2;
        });
        //terminal operator is not called so stream will not execute
        System.out.println(integerStream);

        //terminal operator is called so stream will execute and
        // we will get output after thread 1000 milli sec
        integerStream.forEach(System.out::println);

    }
}
