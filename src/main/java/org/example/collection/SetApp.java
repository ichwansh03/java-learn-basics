package org.example.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetApp {

    public static void main(String[] args) {
        Set<String> values = new HashSet<>(List.of("Ichwan", "Sholihin", "Abdul", "Ahmad", "Abdul"));
        Set<String> linkedValues = new LinkedHashSet<>(List.of("Ichwan", "Sholihin", "Abdul", "Ahmad", "Abdul"));

        for (var name: values) {
            System.out.println(name);
        }

        System.out.println("LinkedHashSet");
        for (var name: linkedValues) {
            System.out.println(name);
        }
    }
}
