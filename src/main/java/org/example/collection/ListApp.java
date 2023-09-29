package org.example.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListApp {

    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>(100);
        num.addAll(List.of(1,2,3,4,5,8,7,6));

        for (var value : num){
            System.out.println(value);
        }
        //Method reference in Iterable
        num.forEach(System.out::println);

        List<String> name = new LinkedList<>(List.of("Andi", "Andre", "Andini", "Abdul"));

        Collections.sort(name);

        for (var value : name){
            System.out.println(value);
        }
    }
}
