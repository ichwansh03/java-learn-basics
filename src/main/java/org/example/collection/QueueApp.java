package org.example.collection;

import java.util.*;

public class QueueApp {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Ichwan");
        queue.offer("Sholihin");
        queue.offer("Ahmad");
        queue.offer("Imamuddin");

        for (var value: queue) {
            System.out.println(value);
        }

        dequesApp();
    }

    public static void dequesApp(){
        Deque<String> deque = new ArrayDeque<>();
        deque.offer("Item 1");
        deque.offer("Item 2");
        deque.offer("Item 3");
        deque.offer("Item 4");
        deque.offerFirst("Item 5");

        for (var value: deque){
            System.out.println(value);
        }
    }
}
