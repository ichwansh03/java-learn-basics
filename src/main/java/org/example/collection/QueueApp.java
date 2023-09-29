package org.example.collection;

import java.util.*;

public class QueueApp {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("Ichwan");
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
        deque.offerFirst("Item 1");
        deque.offerFirst("Item 2");
        deque.offerFirst("Item 3");
        deque.offerLast("Item 4");
        deque.offerFirst("Item 5");

        for (var value: deque){
            System.out.println(value);
        }
    }
}
