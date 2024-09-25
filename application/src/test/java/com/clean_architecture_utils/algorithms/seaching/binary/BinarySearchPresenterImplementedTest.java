package com.clean_architecture_utils.algorithms.seaching.binary;

import com.clean_architecture_utils.algorithms.searching.binary.CleanBinarySearch;
import com.clean_architecture_utils.algorithms.searching.binary.module.*;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

@Tag("Integration Test")
public class BinarySearchPresenterImplementedTest {

    BinarySearchCalculator calculator = new BinarySearchCalculatorImplemented();
    BinarySearchOperator operator = new BinarySearchOperatorImplemented(calculator);
    BinarySearchMapper mapper = new BinarySearchMapperImpl();
    BinarySearchPresenterImplemented binarySearchPresenterImplemented = new BinarySearchPresenterImplemented(mapper, operator);

    int[] array = {1, 3, 32, 42, 62, 87, 100, 1000};

    @Test
    public void theresNotElementInArray() {
        int nonexistentElement = 666;
        int result = binarySearchPresenterImplemented.findElementUsingBinarySearch(array, nonexistentElement);
        assert result == -1;
    }

    @Test
    public void findFirstElement() {
        int existingElement = 1;
        int result = binarySearchPresenterImplemented.findElementUsingBinarySearch(array, existingElement);
        assert result == 0;
    }

    @Test
    public void findLastElement() {
        int lastElement = 1000;
        int result = binarySearchPresenterImplemented.findElementUsingBinarySearch(array, lastElement);
        assert result == array.length - 1;
    }
}
