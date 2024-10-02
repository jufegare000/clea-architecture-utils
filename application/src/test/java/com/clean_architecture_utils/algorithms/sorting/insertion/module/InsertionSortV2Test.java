package com.clean_architecture_utils.algorithms.sorting.insertion.module;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class InsertionSortV2Test {

    InsertionSortV2 insertionSortV2 = new InsertionSortV2();

    @Test
    public void sortAnArrayWithTwoElements(){
        int[] disorderedArray = {21, 3};
        int[] orderedArray = {3, 21};

        insertionSortV2.sort(disorderedArray);

        assert Arrays.equals(disorderedArray, orderedArray);
    }

    @Test
    public void sortAnArrayWithSeveralElements(){
        int[] disorderedArray = {2, 1, 4, 15, 900, 1999, 0, 99, 19};
        int[] orderedArray = {0, 1, 2, 4, 15, 19, 99, 900, 1999};
        insertionSortV2.sort(disorderedArray);
        assert Arrays.equals(disorderedArray, orderedArray);
    }
}
