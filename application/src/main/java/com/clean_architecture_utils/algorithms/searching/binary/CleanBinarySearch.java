package com.clean_architecture_utils.algorithms.searching.binary;

public class CleanBinarySearch {

    public int findIntElement(int element, int[] vector) {
        BinarySearchData binarySearchData = setUpData(vector, element);
        while (evaluateBinaryCondition(binarySearchData)) {
            if (isElementFoundInTheMiddle(binarySearchData)) return binarySearchData.getMiddleElementIndex();
            updateElementsBasedOnFoundElement(binarySearchData);
        }
        return elementHasNotFound();
    }

    public boolean isElementFoundInTheMiddle(BinarySearchData binarySearchData){
        int foundVectorElement = evaluateMiddleInTheStructure(binarySearchData);
        return isFound(foundVectorElement, binarySearchData.getElementTobeFound());
    }

    public int getElementFromTheMiddle(BinarySearchData binarySearchData) {
        return binarySearchData.getArray()[binarySearchData.getMiddleElementIndex()];
    }

    public int evaluateMiddleInTheStructure(BinarySearchData binarySearchData) {
        binarySearchData.setMiddleElementIndex(calculateArrayMiddle(binarySearchData.getFirstElementIndex(), binarySearchData.getLastElementIndex()));
        return getElementFromTheMiddle(binarySearchData);
    }

    public boolean evaluateBinaryCondition(BinarySearchData binarySearchData) {
        return binarySearchData.getFirstElementIndex() <= binarySearchData.getLastElementIndex();
    }

    public void updateElementsBasedOnFoundElement(BinarySearchData binarySearchData) {
        int middle = binarySearchData.getMiddleElementIndex();
        if (checkCurrentElementIsMinorThanTheActual(binarySearchData)) {
            binarySearchData.setLastElementIndex(middle - 1);
        } else binarySearchData.setFirstElementIndex(middle + 1);
    }

    public boolean checkCurrentElementIsMinorThanTheActual(BinarySearchData binarySearchData){
        return binarySearchData.getElementTobeFound() < getElementFromTheMiddle(binarySearchData);
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
    public boolean isFoundV2(BinarySearchData binarySearchData) {
        int foundVectorElement = evaluateMiddleInTheStructure(binarySearchData);
        return (foundVectorElement == binarySearchData.getMiddleElementIndex());
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
