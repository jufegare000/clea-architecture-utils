package com.clean_architecture_utils.algorithms.sorting;

public class RudeBubbleSorting {

    public void sort(int[] arr) {
        boolean swapped;
        int temporaryRegister = 0;
        int lengthOfArray = arr.length;
        for (int i = 0; i < lengthOfArray - 1; i++) {
            swapped = false;
            for (int j = 0; j < lengthOfArray - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temporaryRegister = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temporaryRegister;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public void bubbleSortAPelo(int[] arr) {
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
            if (!swapped) break;
        }
    }

}
