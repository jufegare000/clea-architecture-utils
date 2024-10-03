package com.clean_architecture_utils.algorithms.sorting.selection.module;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SelectionSortV2Test {

    SelectionSortV2 selectionSortV2 = new SelectionSortV2();

    @Test
    public void sortArrayWithTwoElements(){
        int[] disorderedArray = {2, 1};
        int[] orderedArray = {1, 2};
        selectionSortV2.sort(disorderedArray);
        assert Arrays.equals(disorderedArray, orderedArray);
    }

    @Test
    public void sortAnArrayWithThreeElements() {
        int[] disorderedArray = {2, 1, 4};
        int[] orderedArray = {1, 2, 4};
        selectionSortV2.sort(disorderedArray);
        assert Arrays.equals(disorderedArray, orderedArray);
    }

    @Test
    public void sortAnArrayWithTenElements() {
        int[] disorderedArray = {2, 1, 4, 15, 900, 1999, 0, 99, 19};
        int[] orderedArray = {0, 1, 2, 4, 15, 19, 99, 900, 1999};
        selectionSortV2.sort(disorderedArray);
        assert Arrays.equals(disorderedArray, orderedArray);
    }
}
