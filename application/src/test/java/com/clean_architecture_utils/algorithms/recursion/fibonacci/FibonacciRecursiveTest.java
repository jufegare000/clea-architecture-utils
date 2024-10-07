package com.clean_architecture_utils.algorithms.recursion.fibonacci;

import org.junit.jupiter.api.Test;

public class FibonacciRecursiveTest {

    FibonacciRecursive recursiveFibonacci = new FibonacciRecursive();

    @Test
    public void calculateRecursive(){
        Integer number = recursiveFibonacci.calculateRecursiveFibonacci(10);
        assert number == 55;
    }
}
