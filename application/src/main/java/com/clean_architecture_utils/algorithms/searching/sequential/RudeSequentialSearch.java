package com.clean_architecture_utils.algorithms.searching.sequential;

public class RudeSequentialSearch {


     public int findIntElement(int element, int[] vector) {
        int vectorLength = vector.length;
        for (int i = 0; i < vectorLength; i++) {
            if (vector[i] == element) {
                return i;
            }
        }
        System.out.println("El dato no existe");
        return -1;
    }
}
