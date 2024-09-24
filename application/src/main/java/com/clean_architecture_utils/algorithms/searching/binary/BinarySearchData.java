package com.clean_architecture_utils.algorithms.searching.binary;

public class BinarySearchData {

    int[] array;
    int elementTobeFound;
    int firstElementIndex;
    int lastElementIndex;
    int middleElementIndex;

    public BinarySearchData(int[] array, int elementTobeFound, int firstElementIndex, int lastElementIndex, int middleElementIndex) {
        this.array = array;
        this.elementTobeFound = elementTobeFound;
        this.firstElementIndex = firstElementIndex;
        this.lastElementIndex = lastElementIndex;
        this.middleElementIndex = middleElementIndex;
    }

    public int[] getArray() {
        return array;
    }

    public int getElementTobeFound() {
        return elementTobeFound;
    }

    public int getFirstElementIndex() {
        return firstElementIndex;
    }

    public void setFirstElementIndex(int firstElementIndex) {
        this.firstElementIndex = firstElementIndex;
    }

    public int getLastElementIndex() {
        return lastElementIndex;
    }

    public void setLastElementIndex(int lastElementIndex) {
        this.lastElementIndex = lastElementIndex;
    }

    public int getMiddleElementIndex() {
        return middleElementIndex;
    }

    public void setMiddleElementIndex(int middleElementIndex) {
        this.middleElementIndex = middleElementIndex;
    }
}

