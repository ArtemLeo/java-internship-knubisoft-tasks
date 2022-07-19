package com.knubisoft.tasks.algorithm.fibonacci;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciImplTest {

    private final Fibonacci fibonacci = new FibonacciImpl();

    @Test
    void generateNFibonacciSequence() {
        Map<Integer, Integer> lookup = new HashMap<>();

        for (int index = 0; index < 30; index++) {
            assertEquals(fibonacci.generateNFibonacciSequence(index), fib(index, lookup));
        }
    }

    @Disabled("TODO fix me")
    @Test
    void generateNFibonacciSequence1000() {
        Map<Integer, Integer> lookup = new HashMap<>();

        for (int index = 0; index < 1000; index++) {
            assertEquals(fibonacci.generateNFibonacciSequence(index), fib(index, lookup));
        }
    }

    // Function to find the nth Fibonacci number
    public static int fib(int n, Map<Integer, Integer> lookup) {
        if (n <= 1) {
            return n;
        }
        lookup.putIfAbsent(n, fib(n - 1, lookup) + fib(n - 2, lookup));
        return lookup.get(n);
    }
}