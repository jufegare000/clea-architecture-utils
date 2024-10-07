package com.clean_architecture_utils.algorithms.sorting.insertion;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RudeInsertionSortTest {

    RudeInsertionSort rudeInsertionSort = new RudeInsertionSort();

    @Test
    public void sortAnArrayWithTwoElements(){
        int[] disorderedArray = {21, 3};
        int[] orderedArray = {3, 21};

        rudeInsertionSort.sort(disorderedArray);

        assert Arrays.equals(disorderedArray, orderedArray);
    }

    @Test
    public void sortAnArrayWithSeveralElements(){
        int[] disorderedArray = {2, 1, 4, 15, 900, 1999, 0, 99, 19};
        int[] orderedArray = {0, 1, 2, 4, 15, 19, 99, 900, 1999};
        rudeInsertionSort.sort(disorderedArray);
        assert Arrays.equals(disorderedArray, orderedArray);
    }
}
