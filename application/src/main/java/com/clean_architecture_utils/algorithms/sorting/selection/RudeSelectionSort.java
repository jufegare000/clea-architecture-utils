package com.clean_architecture_utils.algorithms.sorting.selection;

public class RudeSelectionSort {


    public void sort(int[] arr) {
        int lengthOfArray = arr.length;
        for (int i = 0; i < lengthOfArray - 1; i++) {
            int lastMinimumIndex = i;
            for (int j = i + 1; j < lengthOfArray; j++) {
                if (arr[j] < arr[lastMinimumIndex]) {
                    lastMinimumIndex = j;
                }
            }
            int temporaryRegister = arr[lastMinimumIndex];
            arr[lastMinimumIndex] = arr[i];
            arr[i] = temporaryRegister;
        }
    }
}
