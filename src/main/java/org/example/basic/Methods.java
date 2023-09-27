package org.example.basic;

public class Methods{
    public static void main(String[] args) {

        System.out.println(calculate(12,5));

        var name = "strong as string\n";

        System.out.println(name.repeat(3));
    }

    static String message(int a, int b) {
        return "Calculate :"+(a+b);
    }

    static String calculate(int a, int b){

        return message(a,b);
    }
}
