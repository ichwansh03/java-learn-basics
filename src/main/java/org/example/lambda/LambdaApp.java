package org.example.lambda;

import java.util.function.*;

public class LambdaApp {

    public static void main(String[] args) {

        LambdaApp app = new LambdaApp();
        Predicate<String> validation = app::validate;
        System.out.println(validation.test("Hello123"));

        SimpleLambda lambda = nama -> "Hello "+nama;
        System.out.println(lambda.action("Ichwan"));

        Supplier<String> supplier =  () -> "ICHWAN";
        System.out.println(supplier.get());

        ValidationLambda<String, String> validates = (username, password) -> username.matches("root") && password.matches("hi123");
        System.out.println(validates.login("12","12"));

        //Example method references
        LambdaApp app2 = new LambdaApp();
        ValidationLambda<String, String> validates2 = app2::login;
        System.out.println(validates2.login("12","12"));

    }

    private boolean login(String username, String password) {
        return username.matches("root") && password.matches("hi123");
    }

    private boolean validate(String value) {
        return value.matches("Hello123");
    }
}
