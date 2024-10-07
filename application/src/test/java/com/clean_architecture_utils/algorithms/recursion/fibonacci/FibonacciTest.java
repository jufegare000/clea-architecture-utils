package com.clean_architecture_utils.algorithms.recursion.fibonacci;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Objects;

public class FibonacciTest {

    public FibonacciMain fibonacciMain = new FibonacciMain();

    @Test
    public void testForBasicCase() throws Exception {
        Integer firstItem = 0;
        List<Integer> fibonacciResult = fibonacciMain.getSumOfNthFibonacci(firstItem);
        assert fibonacciResult.size() == 1;
    }

    @Test
    public void testForOneItem() throws Exception {
        Integer secondElementhOfTheSerie = 1;
        List<Integer> fibonacciResult = fibonacciMain.getSumOfNthFibonacci(secondElementhOfTheSerie);
        assert fibonacciResult.size() == 2;
    }

    @Test
    public void testForThe10thElement() throws Exception {
        Integer nthTheSerie = 10;
        Integer expectedResul = 55;
        List<Integer> fibonacciResult = fibonacciMain.getSumOfNthFibonacci(nthTheSerie);
        assert fibonacciResult.size() == nthTheSerie + 1;
        assert Objects.equals(fibonacciResult.get(nthTheSerie), expectedResul);
    }


}
