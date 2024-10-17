package com.clean_architecture_utils.algorithms.sorting.selection.module;

public class SelectionSortData {

    int[] array;
    int smallestElementIndex;

    public SelectionSortData(int[] array) {
        this.array = array;
        this.smallestElementIndex = 0;
    }

    public int getSizeOfArray(){
        return this.array.length;
    }

    public int getSmallestElement(){
        return this.array[smallestElementIndex];
    }

    public int getElementOfArrayAtPosition(int index){
        return this.array[index];
    }

    public void swapArrayElementsBasedOnInnerLoop(int index){
        int temporaryRegister = this.array[smallestElementIndex];
        this.array[this.smallestElementIndex] = this.array[index];
        this.array[index] = temporaryRegister;
    }

    public void updateSmallestElementIndex(int value){
        this.smallestElementIndex = value;
    }
}
