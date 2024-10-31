package com.clean_architecture_utils.algorithms.sorting.bubble;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RudeBubbleSortingTest {

    RudeBubbleSorting rudeBubbleSorting = new RudeBubbleSorting();

    @Test
    public void theArrayIsEmpty(){
        int[] emptyArray = {};
        rudeBubbleSorting.sort(emptyArray);
        assert emptyArray.length == 0;
    }


    @Test
    public void sortAnArrayWithTwoElements() {
        int[] disorderedArray = {2, 1};
        int[] orderedArray = {1, 2};
        rudeBubbleSorting.sort(disorderedArray);
        assert Arrays.equals(disorderedArray, orderedArray);
    }

    @Test
    public void sortAnArrayWithThreeElements() {
        int[] disorderedArray = {2, 1, 4};
        int[] orderedArray = {1, 2, 4};
        rudeBubbleSorting.sort(disorderedArray);
        assert Arrays.equals(disorderedArray, orderedArray);
    }

    @Test
    public void sortAnArrayWithTenElements() {
        int[] disorderedArray = {2, 1, 4, 15, 900, 1999, 0, 99, 19};
        int[] orderedArray = {0, 1, 2, 4, 15, 19, 99, 900, 1999};
        rudeBubbleSorting.sort(disorderedArray);
        assert Arrays.equals(disorderedArray, orderedArray);
    }
}
