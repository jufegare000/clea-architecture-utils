package com.clean_architecture_utils.algorithms.sorting.insertion.module;

public class InsertionSortData {

    int[] array;

    int currentElement;
    int currentIterationIndex;

    int innerIterationIndex;
    int currentInnerElement;

    public InsertionSortData(int[] array) {
        this.array = array;
        this.currentIterationIndex = 0;
        this.currentElement = array[currentIterationIndex];
        this.innerIterationIndex = 0;
    }

    public int getCurrentElement() {
        return currentElement;
    }

    public int getCurrentIterationIndex() {
        return currentIterationIndex;
    }


    public void decreaseInnerIndexBasedOnCurrentIndex() {
        this.innerIterationIndex = this.currentIterationIndex - 1;
    }

    public int getInnerIterationIndex() {
        return innerIterationIndex;
    }

    public void swapNextNeighbor() {
        this.array[this.getInnerIterationIndex() + 1] = this.array[this.getInnerIterationIndex()];
    }

    public void decreaseInnerIndex() {
        this.innerIterationIndex--;
    }

    public void updateCurrentElement() {
        this.currentElement = this.array[currentIterationIndex];
    }

    public void updateCurrentParameters() {
        this.currentElement = this.array[currentIterationIndex];
    }

    public void updateCurrentElementWithNextNeighbor() {
        this.array[this.innerIterationIndex + 1] = currentElement;
    }

    public void increaseIteratorIndex() {
        this.currentIterationIndex++;
    }

    public boolean isTheEndOfArray() {
        return (this.currentIterationIndex >= this.array.length);
    }

    public boolean isPossibleToOrder() {
        if(this.innerIterationIndex < 0) return false;
        else {
            this.updateCurrentInnerElement();
            return (this.innerIterationIndex >= 0 && this.currentInnerElement > this.currentElement);
        }
    }

    private void updateCurrentInnerElement() {
        this.currentInnerElement = this.array[this.innerIterationIndex];
    }
}
