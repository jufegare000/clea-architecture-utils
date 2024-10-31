package com.clean_architecture_utils.algorithms.recursion.fibonacci;


public class FibonacciRecursive {

    public Integer calculateRecursiveFibonacci(Integer currentNumber) {
        if (currentNumber == 0) {
            return 0;
        } else if (currentNumber == 1) {
            return 1;
        } else {
            return calculateRecursiveFibonacci(currentNumber - 1) + calculateRecursiveFibonacci(currentNumber - 2);
        }
    }
}
