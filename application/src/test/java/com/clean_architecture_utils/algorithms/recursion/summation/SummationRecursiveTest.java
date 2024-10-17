package com.clean_architecture_utils.algorithms.recursion.summation;

import org.junit.jupiter.api.Test;

public class SummationRecursiveTest {

    SummationRecursive summationRecursive = new SummationRecursive();

    @Test
    public void testBaseCase(){
        int baseElement = 0;
        int resultOfSum = summationRecursive.sumNTerms(baseElement);
        assert baseElement == resultOfSum;
    }

    @Test
    public void testTheSummationOf1To3(){
        int element = 3;
        int expectedResult = 6;
        int resultOfSum = summationRecursive.sumNTerms(element);
        assert resultOfSum == expectedResult;
    }

    @Test
    public void testTheSummationOf1To10(){
        int element = 10;
        int expectedResult = 55;
        int resultOfSum = summationRecursive.sumNTerms(element);
        assert resultOfSum == expectedResult;
    }
}
