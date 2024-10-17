package com.clean_architecture_utils.algorithms.sorting.bubble.module;

public class BubbleSortingData {
    int[] array;
    boolean swapped;

    public BubbleSortingData(int[] array) {
        this.array = array;
        this.swapped = false;
    }

    public int lengthOfArrayForRound() {
        return this.array.length - 1;
    }

    public int getElementAtPosition(int index) {
        return this.array[index];
    }

    public boolean isCurrentElementGreaterThanTheNext(int index) {
        return this.array[index] > this.array[index + 1];
    }

    public boolean isSwapped() {
        return swapped;
    }

    public void turnOffSwapped() {
        this.swapped = false;
    }

    public void turnOnSwapped() {
        this.swapped = true;
    }

    public void swapArrayElementsBasedOnGrater(int index){
        int temporaryRegister = this.array[index+1];
        this.array[index+1] = this.array[index];
        this.array[index] = temporaryRegister;
    }
}
