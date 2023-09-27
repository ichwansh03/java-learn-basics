package org.example.basic;

public class RecursiveProblem {

    public static void main(String[] args) {
        loop(10000);
    }

    static void loop(int value){
        if (value == 0){
            System.out.println("Done");
        } else {
            System.out.println("Loop "+value);
            loop(value-1);
        }
    }
}
