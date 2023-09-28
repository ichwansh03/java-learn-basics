package org.example.standard_classes;

import java.util.Arrays;

public class Strings {

    public static void main(String[] args) {
        var name = "Ichwan Sholhin";

        System.out.println(name.length());
        System.out.println(Arrays.toString(name.split(" ")));

        String[] names = name.split(" ");
        for (var value : names){
            System.out.println(value);
        }

        StringBuilder builder = new StringBuilder();
        builder.append("Ichwan ");
        builder.append("Sholihin");

        System.out.println(builder);

        StringBuffer buffer = new StringBuffer();
        buffer.append("Ichwan ");
        buffer.append("Sholehuddin");

        System.out.println(buffer);

        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.freeMemory());
    }
}
