package org.example.lambda;

import java.util.Optional;

public class OptionalApp {

    public static void main(String[] args) {
        register("root");
        register(null);
    }

    public static void register(String username){
//        Optional.ofNullable(username)
//                .map(String::toLowerCase)
//                .ifPresentOrElse(
//                        value -> System.out.println("username : "+value),
//                        () -> System.out.println("username is null"));

        Optional.ofNullable(username)
                .map(String::toLowerCase)
                .orElse("Username is null");

        System.out.println("username : "+username);
    }
}
