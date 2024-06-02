package com.example;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // Optimized work
        double[] results = new double[1000000];
        for (int i = 0; i < results.length; i++) {
            results[i] = Math.sin(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Execution time: " + (endTime - startTime) + "ms");
    }
}
