package com.example.reactiveProgramming.common;

import com.github.javafaker.Faker;

import java.util.stream.IntStream;

public class FakerDemo {

    public static void main(String[] args) {
        IntStream.range(0,10).forEach(f-> System.out.println(Faker.instance().name().fullName()));
    }
}
