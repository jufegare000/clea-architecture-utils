package com.clean_architecture_utils.algorithms.searching.binary;

public class BinarySearchData {

    int[] array;
    int elementTobeFound;
    int firstElement;
    int lastElement;
    int middle;

    public BinarySearchData(int[] array, int elementTobeFound, int firstElement, int lastElement, int middle) {
        this.array = array;
        this.elementTobeFound = elementTobeFound;
        this.firstElement = firstElement;
        this.lastElement = lastElement;
        this.middle = middle;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getElementTobeFound() {
        return elementTobeFound;
    }

    public void setElementTobeFound(int elementTobeFound) {
        this.elementTobeFound = elementTobeFound;
    }

    public int getFirstElement() {
        return firstElement;
    }

    public void setFirstElement(int firstElement) {
        this.firstElement = firstElement;
    }

    public int getLastElement() {
        return lastElement;
    }

    public void setLastElement(int lastElement) {
        this.lastElement = lastElement;
    }

    public int getMiddle() {
        return middle;
    }

    public void setMiddle(int middle) {
        this.middle = middle;
    }
}

