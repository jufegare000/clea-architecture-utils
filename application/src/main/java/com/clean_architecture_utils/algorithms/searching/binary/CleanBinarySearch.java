package com.clean_architecture_utils.algorithms.searching.binary;

public class CleanBinarySearch {

    public int findIntElement(int element, int[] vector) {
        BinarySearchData binarySearchData = setUpData(vector, element);
        while (evaluateBinaryCondition(binarySearchData)) {
            int foundVectorElement = evaluateMiddleInTheStructure(binarySearchData);
            if (isFound(foundVectorElement, element)) return binarySearchData.getElementTobeFound();
            updateElementsBasedOnFoundElement(binarySearchData);
        }
        return elementHasNotFound();
    }

    public int getElementFromTheMiddle(BinarySearchData binarySearchData) {
        return binarySearchData.getArray()[binarySearchData.getMiddle()];
    }

    public int evaluateMiddleInTheStructure(BinarySearchData binarySearchData) {
        binarySearchData.setMiddle(calculateArrayMiddle(binarySearchData.getFirstElement(), binarySearchData.getLastElement()));
        return getElementFromTheMiddle(binarySearchData);
    }

    public boolean evaluateBinaryCondition(BinarySearchData binarySearchData) {
        return binarySearchData.getFirstElement() <= binarySearchData.getLastElement();
    }

    public void updateElementsBasedOnFoundElement(BinarySearchData binarySearchData) {
        int middle = binarySearchData.getMiddle();
        int elementToBeFound = binarySearchData.getElementTobeFound();
        int foundElement = getElementFromTheMiddle(binarySearchData);
        if (elementToBeFound < foundElement) {
            binarySearchData.setLastElement(middle - 1);
        } else binarySearchData.setFirstElement(middle + 1);
    }

    public int elementHasNotFound() {
        System.out.println("ELEMENT HAS NOT FOUND");
        return -1;
    }

    int extractLastPositionOfArray(int[] vector) {
        return vector.length - 1;
    }

    public boolean isFound(int foundElement, int middle) {
        return (foundElement == middle);
    }

    private int calculateArrayMiddle(int firstElement, int lastElement) {
        return (firstElement + lastElement) / 2;
    }

    private BinarySearchData setUpData(int[] array, int element) {
        int lastElement = extractLastPositionOfArray(array);
        int firstElement = 0;
        int middleElement = calculateArrayMiddle(firstElement, lastElement);
        return new BinarySearchData(array, element, firstElement, lastElement, middleElement);
    }
}
