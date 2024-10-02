package com.clean_architecture_utils.algorithms.sorting.insertion.module;

public class InsertionSortV2 {
    /*
        public void sort(int[] arr) {
            int lengthOfArray = arr.length;
            for (int i = 0; i < lengthOfArray; i++) {
                int currentElement = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > currentElement) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = currentElement;
            }
        }

     */
    public void orderDelimitedElements(InsertionSortData insertionSortData) {
        insertionSortData.updateCurrentElement();
        insertionSortData.decreaseInnerIndexBasedOnCurrentIndex();
        while (evaluateInnerLoopCondition(insertionSortData)) {
            swapInnerElements(insertionSortData);
        }
        updateArrayElements(insertionSortData);
    }

    public void sort(int[] arr) {
        InsertionSortData insertionSortData = setupSortingStructure(arr);
        while (!isEndOfTheArray(insertionSortData)) {
            orderDelimitedElements(insertionSortData);
        }
    }


    public boolean isEndOfTheArray(InsertionSortData insertionSortData) {
        return (insertionSortData.isTheEndOfArray());
    }

    public void updateArrayElements(InsertionSortData insertionSortData) {
        insertionSortData.updateCurrentElementWithNextNeighbor();
        insertionSortData.increaseIteratorIndex();
    }

    public void swapInnerElements(InsertionSortData insertionSortData) {
        insertionSortData.swapNextNeighbor();
        insertionSortData.decreaseInnerIndex();
    }

    public boolean evaluateInnerLoopCondition(InsertionSortData insertionSortData) {
        return insertionSortData.isPossibleToOrder();
    }

    public InsertionSortData setupSortingStructure(int[] arr) {
        return new InsertionSortData(arr);
    }
}
