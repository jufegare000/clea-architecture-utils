package com.clean_architecture_utils.algorithms.recursion.factorial;

import org.junit.jupiter.api.Test;

public class FactorialRecursiveTest {

    FactorialRecursive factorialRecursive = new FactorialRecursive();

    @Test
    public void testBaseCase(){
        int baseCaseElement = 0;
        int expectedElement = 1;
        int result = factorialRecursive.calculate(baseCaseElement);
        assert result == expectedElement;
    }

    @Test
    public void testTheFactorialOf1to3(){
        int element = 3;
        int expectedElement = 6;
        int result = factorialRecursive.calculate(element);
        assert result == expectedElement;
    }

    @Test
    public void testFactorialOfAGreatNumber(){
        int element = 10;
        int expectedElement = 3628800;
        int result = factorialRecursive.calculate(element);
        assert result == expectedElement;
    }
}
