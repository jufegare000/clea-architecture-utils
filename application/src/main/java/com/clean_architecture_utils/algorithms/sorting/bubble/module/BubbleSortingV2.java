package com.clean_architecture_utils.algorithms.sorting.bubble.module;

public class BubbleSortingV2 {

    public void sort(int[] arr) {
        BubbleSortingData bubbleSortingData = setUpStructure(arr);
        for (int i = 0; i < bubbleSortingData.lengthOfArrayForRound(); i++) {
            bubbleSortingData.turnOffSwapped();
            for (int j = 0; j < bubbleSortingData.lengthOfArrayForRound(); j++) {
                if (isCurrentElementGreaterThanTheNext(bubbleSortingData, j)) {
                    swapArrayElementsBasedOnGrater(bubbleSortingData, j);
                }
            }
            i = breakTheCycle(bubbleSortingData, i);
        }
    }

    public void swapArrayElementsBasedOnGrater(BubbleSortingData bubbleSortingData, int index) {
        bubbleSortingData.turnOnSwapped();
        bubbleSortingData.swapArrayElementsBasedOnGrater(index);
    }

    public boolean isCurrentElementGreaterThanTheNext(BubbleSortingData bubbleSortingData, int index) {
        return bubbleSortingData.isCurrentElementGreaterThanTheNext(index);
    }

    public int breakTheCycle(BubbleSortingData bubbleSortingData, int index) {
        if (!bubbleSortingData.isSwapped()) {
            return bubbleSortingData.lengthOfArrayForRound();
        } else return index;
    }

    public BubbleSortingData setUpStructure(int[] array) {
        return new BubbleSortingData(array);
    }
}
