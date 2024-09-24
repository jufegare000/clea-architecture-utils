package com.clean_architecture_utils.algorithms.searching.binary.module;

import com.clean_architecture_utils.algorithms.searching.binary.BinarySearchData;

public class BinarySearchCalculatorImplemented implements BinarySearchCalculator {

    @Override
    public boolean evaluateBinarySearchCondition(BinarySearchData binarySearchData) {
        return binarySearchData.getFirstElementIndex() <= binarySearchData.getLastElementIndex();
    }

    @Override
    public boolean isElementFoundInTheMiddle(BinarySearchData binarySearchData) {
        int foundVectorElement = evaluateMiddleInTheStructure(binarySearchData);
        return isFound(foundVectorElement, binarySearchData.getElementTobeFound());
    }

    @Override
    public int getElementFromTheMiddle(BinarySearchData binarySearchData) {
        return binarySearchData.getArray()[binarySearchData.getMiddleElementIndex()];
    }

    @Override
    public boolean isFound(int foundElement, int middle) {
        return (foundElement == middle);
    }

    @Override
    public boolean checkCurrentElementIsMinorThanTheActual(BinarySearchData binarySearchData) {
        return binarySearchData.getElementTobeFound() < getElementFromTheMiddle(binarySearchData);
    }

    @Override
    public void updateElementsBasedOnFoundElement(BinarySearchData binarySearchData) {
        int middle = binarySearchData.getMiddleElementIndex();
        if (checkCurrentElementIsMinorThanTheActual(binarySearchData)) {
            binarySearchData.setLastElementIndex(middle - 1);
        } else binarySearchData.setFirstElementIndex(middle + 1);
    }

    public int evaluateMiddleInTheStructure(BinarySearchData binarySearchData) {
        binarySearchData.setMiddleElementIndex(calculateArrayMiddle(binarySearchData));
        return getElementFromTheMiddle(binarySearchData);
    }

    private int calculateArrayMiddle(BinarySearchData binarySearchData) {
        return (binarySearchData.getFirstElementIndex() + binarySearchData.getLastElementIndex()) / 2;
    }
}
