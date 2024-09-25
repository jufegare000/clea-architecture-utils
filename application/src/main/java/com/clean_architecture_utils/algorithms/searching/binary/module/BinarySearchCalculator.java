package com.clean_architecture_utils.algorithms.searching.binary.module;

import com.clean_architecture_utils.algorithms.searching.binary.BinarySearchData;

public interface BinarySearchCalculator {
    boolean evaluateBinarySearchCondition(BinarySearchData binarySearchData);

    boolean isElementFoundInTheMiddle(BinarySearchData binarySearchData);

    int getElementFromTheMiddle(BinarySearchData binarySearchData);

    boolean isFound(int foundElement, int middle);

    boolean checkCurrentElementIsMinorThanTheActual(BinarySearchData binarySearchData);

    void updateElementsBasedOnFoundElement(BinarySearchData binarySearchData);

}
