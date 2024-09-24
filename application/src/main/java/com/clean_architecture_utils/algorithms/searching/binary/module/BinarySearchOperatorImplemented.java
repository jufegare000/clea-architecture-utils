package com.clean_architecture_utils.algorithms.searching.binary.module;

import com.clean_architecture_utils.algorithms.searching.binary.BinarySearchData;

public class BinarySearchOperatorImplemented implements BinarySearchOperator {

    static int NOT_FOUND_INDEX = -1;

    private BinarySearchCalculator binarySearchCalculator;

    public BinarySearchOperatorImplemented(BinarySearchCalculator binarySearchCalculator) {
        this.binarySearchCalculator = binarySearchCalculator;
    }

    @Override
    public int performBinarySearch(BinarySearchData binarySearchData) {
        while (binarySearchCalculator.evaluateBinarySearchCondition(binarySearchData)) {
            if (binarySearchCalculator.isElementFoundInTheMiddle(binarySearchData)) return binarySearchData.getMiddleElementIndex();
            binarySearchCalculator.updateElementsBasedOnFoundElement(binarySearchData);
        }
        return NOT_FOUND_INDEX;
    }
}
