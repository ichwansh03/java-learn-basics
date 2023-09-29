package org.example.collection;

import java.util.*;

public class MapApp {
    public static void main(String[] args) {
        Map<Integer, String> maps = new HashMap<>();
        //Map<Integer, String> maps = new IdentityHashMap<>();
        //Map<Integer, String> maps = new LinkedHashMap<>();
        //Map<Integer, String> maps = new WeakHashMap<>();
        maps.put(1,"First");
        maps.put(2,"Second");
        maps.put(3,"Third");
        maps.put(1,"Pertama");

        for (var key: maps.keySet()) {
            System.out.println(key);
        }

        for (var value: maps.values()) {
            System.out.println(value);
        }

        entries(maps);
    }

    public static void entries(Map<Integer, String> map){
        //Set<Map.Entry<Integer, String>> entries = map.entrySet();

//        for (var entry : entries){
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//        }

        map.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}
