package com.clean_architecture_utils.algorithms.seaching.binary;

import com.clean_architecture_utils.algorithms.searching.binary.BinarySearchData;
import com.clean_architecture_utils.algorithms.searching.binary.module.BinarySearchCalculatorImplemented;
import org.junit.jupiter.api.Test;

public class BinarySearchCalculatorTest {

    BinarySearchCalculatorImplemented binarySearchCalculatorImplemented = new BinarySearchCalculatorImplemented();
    static int ELEMENT_IN_THE_MIDDLE = 3;
    static int INDEX_IN_THE_MIDDLE = 2;
    static int MAX_ELEMENT = 5;
    static int MAX_ELEMENT_INDEX = 4;

    int[] mockArr = {1, 2, ELEMENT_IN_THE_MIDDLE, 4, MAX_ELEMENT};

    @Test
    public void testTrueBinaryCondition() {
        BinarySearchData mockData = new BinarySearchData(mockArr, 0, 0, 0, 0);
        assert binarySearchCalculatorImplemented.evaluateBinarySearchCondition(mockData);
    }

    @Test
    public void testFalsyBinaryCondition() {
        BinarySearchData mockData = new BinarySearchData(mockArr, 0, 10, 0, 0);
        assert !binarySearchCalculatorImplemented.evaluateBinarySearchCondition(mockData);
    }

    @Test
    public void getElementInTheMiddle() {
        BinarySearchData mockData = new BinarySearchData(mockArr, 0, 10, 0, INDEX_IN_THE_MIDDLE);
        assert binarySearchCalculatorImplemented.getElementFromTheMiddle(mockData) == ELEMENT_IN_THE_MIDDLE;
    }

    @Test
    public void theElementIsMinor() {
        BinarySearchData mockData = new BinarySearchData(mockArr, 0, 10, 0, INDEX_IN_THE_MIDDLE);
        assert binarySearchCalculatorImplemented.checkCurrentElementIsMinorThanTheActual(mockData);
    }

    @Test
    public void theElementIsBigger() {
        BinarySearchData mockData = new BinarySearchData(mockArr, MAX_ELEMENT_INDEX, 10, 0, INDEX_IN_THE_MIDDLE);
        assert !binarySearchCalculatorImplemented.checkCurrentElementIsMinorThanTheActual(mockData);
    }

    @Test
    public void elementFound() {
        assert binarySearchCalculatorImplemented.isFound(ELEMENT_IN_THE_MIDDLE, ELEMENT_IN_THE_MIDDLE);
    }

    @Test
    public void elementNotFound() {
        assert !binarySearchCalculatorImplemented.isFound(ELEMENT_IN_THE_MIDDLE, MAX_ELEMENT);
    }

    @Test
    public void evaluateMiddle() {
        BinarySearchData mockData = new BinarySearchData(mockArr, MAX_ELEMENT_INDEX, 0, 0, INDEX_IN_THE_MIDDLE);
        int expectedHalf = 1;
        int resul = binarySearchCalculatorImplemented.evaluateMiddleInTheStructure(mockData);
        assert resul == expectedHalf;
    }

    @Test
    public void updateParameters() {
        BinarySearchData mockData = new BinarySearchData(mockArr, MAX_ELEMENT_INDEX, 0, 0, INDEX_IN_THE_MIDDLE);
        binarySearchCalculatorImplemented.updateElementsBasedOnFoundElement(mockData);
    }

}
