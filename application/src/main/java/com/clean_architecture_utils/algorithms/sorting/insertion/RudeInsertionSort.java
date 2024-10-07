package com.clean_architecture_utils.algorithms.sorting.insertion;

public class RudeInsertionSort {

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
}
