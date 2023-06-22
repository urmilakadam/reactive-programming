package com.example.reactiveProgramming.hotColdPublisher;

import com.example.reactiveProgramming.util.Subscriber;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.stream.Stream;

public class ColdPublisher {

    public static void main(String[] args) {

        Flux<String> stringFlux = Flux.fromStream(()->getScene())
                .delayElements(Duration.ofSeconds(2));

        stringFlux.subscribe(Subscriber.subscriber("Sam"));
        Subscriber.sleepSecond(5);

        stringFlux.subscribe(Subscriber.subscriber("Urmila"));
        Subscriber.sleepSecond(60);
    }

    public static Stream<String> getScene(){

        return Stream.of("Scene1", "Scene2", "Scene3","Scene4","Scene5","Scene6","Scene7","Scene8");

    }
}
