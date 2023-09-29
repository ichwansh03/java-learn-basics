package org.example.lambda;

@FunctionalInterface
public interface ValidationLambda<U,P> {

    boolean login(U username, P password);
}
