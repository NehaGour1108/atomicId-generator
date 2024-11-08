package org.example;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    // AtomicInteger to handle the ID increment atomically
    private static final AtomicInteger idCounter = new AtomicInteger(0);

    // Method to get the next unique ID
    public static int getNextId() {
        return idCounter.incrementAndGet();  // Atomically increments and returns the updated value
    }

    public static void main(String[] args) {
        // Testing the ID generator
        System.out.println("Next ID: " + getNextId()); // Should print 1
        System.out.println("Next ID: " + getNextId()); // Should print 2
        System.out.println("Next ID: " + getNextId()); // Should print 3
    }
}
