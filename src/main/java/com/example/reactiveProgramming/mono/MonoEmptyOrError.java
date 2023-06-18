package com.example.reactiveProgramming.mono;

import com.example.reactiveProgramming.util.Subscriber;
import reactor.core.publisher.Mono;

public class MonoEmptyOrError {

    public static void main(String[] args) {

        userRepository(45)
                .subscribe(
                        Subscriber.onNext(),
                        Subscriber.onError(),
                        Subscriber.onComplete()
                );

    }

    private static Mono<String> userRepository(int userId){
        if(userId == 1)
            return Mono.just(Subscriber.faker().name().fullName());
        else if(userId == 2)
            return Mono.empty();
        else
            return Mono.error(new RuntimeException("User Not Found."));
    }
}
