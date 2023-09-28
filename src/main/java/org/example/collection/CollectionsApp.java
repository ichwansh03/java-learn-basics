package org.example.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionsApp {

    public static void main(String[] args) {
        //implementasi set untuk adapter seperti di Android
        Collection<String> collection = new ArrayList<>();
        collection.add("Item 1");
        collection.add("Item 2");
        collection.add("Item 3");
        collection.clear();
        collection.addAll(List.of("Item 4","Item 5","Item 6"));

        for (var value: collection){
            System.out.println(value);
        }

        //mengecek data
        System.out.println(collection.contains("Item 6"));
    }
}
