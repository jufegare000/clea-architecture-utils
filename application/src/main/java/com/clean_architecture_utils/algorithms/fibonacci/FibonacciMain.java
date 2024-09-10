package com.clean_architecture_utils.algorithms.fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FibonacciMain {

    public List<Integer> getSumOfNthFibonacci(int maxNumber) throws Exception {

        List<Integer> fibonacciList = setUpFirstItemList(maxNumber);

        IntStream.range(2, maxNumber + 1)
                .forEach(i -> calculateFibonacci(fibonacciList, i));

        return fibonacciList;
    }


    List<Integer> setUpFirstItemList(Integer maxNumber) throws Exception {
        Integer fibonnaci0 = 0;
        Integer fibonnaci1 = 1;
        List<Integer> fibonacciList = new ArrayList<>();
        if (maxNumber < 0) {
            throw new Exception("Fibonnaci is not allowed for negative numbers");
        } else if (maxNumber == 0) {
            fibonacciList.add(fibonnaci0);
        } else {
            fibonacciList.add(fibonnaci0);
            fibonacciList.add(fibonnaci1);
        }
        return fibonacciList;
    }

    List<Integer> calculateFibonacci(List<Integer> fibonacciList, int currentTerm) {
        Integer Fibnminus1 = fibonacciList.get(currentTerm - 1);
        Integer Fibnminus2 = fibonacciList.get(currentTerm - 2);
        fibonacciList.add(calculateFibonacciSum(Fibnminus1, Fibnminus2));
        return fibonacciList;
    }

    Integer calculateFibonacciSum(Integer previous, Integer current) {
        return previous + current;
    }
}
