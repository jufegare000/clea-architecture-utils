package com.clean_architecture_utils.algorithms.sorting.selection;

public class RudeSelectionSort {

    public void sort(int[] arr){
        int lengthOfArray = arr.length;
        int lastSmallestIndex = 0;
        int temporaryRegister = 0;
        for(int i = 0; i < lengthOfArray - 1; i++){
            lastSmallestIndex = i;
            for(int j = i +1; j < lengthOfArray; j++){
                if(arr[j]< arr[lastSmallestIndex]){
                    lastSmallestIndex = j;
                }
            }
            temporaryRegister = arr[lastSmallestIndex];
            arr[lastSmallestIndex] = arr[i];
            arr[i] = temporaryRegister;
        }
    }
}
