package com.clean_architecture_utils.algorithms.searching.binary.module;

import com.clean_architecture_utils.algorithms.searching.binary.BinarySearchData;

public class BinarySearchMapperImpl implements BinarySearchMapper{
    @Override
    public BinarySearchData setUpData(int[] array, int element) {
        int lastElement = extractLastPositionOfArray(array);
        int firstElement = 0;
        int middleElement = calculateArrayMiddle(firstElement, lastElement);
        return new BinarySearchData(array, element, firstElement, lastElement, middleElement);
    }

    @Override
    public int calculateHalfOfSegment(BinarySearchData binarySearchData) {
        calculateArrayMiddle(binarySearchData.getFirstElementIndex(), binarySearchData.getLastElementIndex());
        return getElementFromTheMiddle(binarySearchData);
    }

    @Override
    public int getElementFromTheMiddle(BinarySearchData binarySearchData) {
        return binarySearchData.getArray()[binarySearchData.getMiddleElementIndex()];
    }

    private int calculateArrayMiddle(int firstElement, int lastElement) {
        return (firstElement + lastElement) / 2;
    }

    int extractLastPositionOfArray(int[] vector) {
        return vector.length - 1;
    }

}
