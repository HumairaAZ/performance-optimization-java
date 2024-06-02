package com.example;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // Simulate some work
        for (int i = 0; i < 1000000; i++) {
            Math.sin(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Execution time: " + (endTime - startTime) + "ms");
    }
}
