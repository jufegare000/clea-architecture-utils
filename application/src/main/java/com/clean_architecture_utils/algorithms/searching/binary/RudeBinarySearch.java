package com.clean_architecture_utils.algorithms.searching.binary;

public class RudeBinarySearch {


    public int findIntElement(int element, int[] vector) {
        int lastElement = vector.length;
        int firstElement = 0;
        while (firstElement <= lastElement) {
            int middle = (firstElement + lastElement) / 2;
            if (vector[middle] == element) {
                return middle;
            }
            if (vector[middle] > element) {
                lastElement = middle - 1;
            } else {
                firstElement = middle + 1;
            }
        }
        System.out.println("ELEMENT HAS NOT FOUND");
        return -1;
    }

}
