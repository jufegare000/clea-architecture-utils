package com.clean_architecture_utils.algorithms.fibonacci;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FibonacciMain {

    public List<Integer> getSumOfNthFibonacci(int maxNumber) throws Exception {
        List<Integer> fibonacciList = setUpFirstItemList(maxNumber);
        IntStream.range(2, maxNumber + 1)
                .forEach(i -> calculateFibonacci(fibonacciList, i));

        return fibonacciList;
    }

    List<Integer> setUpFirstItemList(Integer maxNumber) throws Exception {
        validatePositiveValue(maxNumber);
        return IntStream.rangeClosed(0, maxNumber)
                .boxed()
                .filter(n -> n == 0 || n == 1)
                .collect(Collectors.toList());
    }

    void validatePositiveValue(Integer number) throws Exception {
        if (number < 0) {
            throw new Exception("Fibonnaci is not allowed for negative numbers");
        }
    }

    void calculateFibonacci(List<Integer> fibonacciList, int currentTerm) {
        Integer Fibnminus1 = fibonacciList.get(currentTerm - 1);
        Integer Fibnminus2 = fibonacciList.get(currentTerm - 2);
        fibonacciList.add(calculateFibonacciSum(Fibnminus1, Fibnminus2));
    }

    Integer calculateFibonacciSum(Integer previous, Integer current) {
        return previous + current;
    }
}
