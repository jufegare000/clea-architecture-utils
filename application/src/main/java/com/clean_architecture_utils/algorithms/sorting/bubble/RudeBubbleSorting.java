package com.clean_architecture_utils.algorithms.sorting.bubble;

public class RudeBubbleSorting {


    public void sort(int[] arr) {
        int lengthOfArrayForRound = arr.length - 1;
        int temporaryRegister = 0;
        for(int i = 0; i < lengthOfArrayForRound; i++){
            boolean swapped = false;
            for (int j = 0; j < lengthOfArrayForRound; j++) {
                if(arr[j] > arr[j+1]){
                    swapped = true;
                    temporaryRegister = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temporaryRegister;
                }
            }
            if (!swapped) {
                i = lengthOfArrayForRound;
            };
        }
    }

}
