package com.clean_architecture_utils.algorithms.sorting.selection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RudeSelectionAlgorithmTest {

    RudeSelectionSort rudeSelectionSort = new RudeSelectionSort();

    @Test
    public void baseCaseArrayIsEmpty() {
        int[] emptyArray = {};
        rudeSelectionSort.sort(emptyArray);
        assert emptyArray.length == 0;
    }


    @Test
    public void sortArrayWithTwoElements(){
        int[] disorderedArray = {2, 1};
        int[] orderedArray = {1, 2};
        rudeSelectionSort.sort(disorderedArray);
        assert Arrays.equals(disorderedArray, orderedArray);
    }

    @Test
    public void sortAnArrayWithThreeElements() {
        int[] disorderedArray = {2, 1, 4};
        int[] orderedArray = {1, 2, 4};
        rudeSelectionSort.sort(disorderedArray);
        assert Arrays.equals(disorderedArray, orderedArray);
    }

    @Test
    public void sortAnArrayWithTenElements() {
        int[] disorderedArray = {2, 1, 4, 15, 900, 1999, 0, 99, 19};
        int[] orderedArray = {0, 1, 2, 4, 15, 19, 99, 900, 1999};
        rudeSelectionSort.sort(disorderedArray);
        assert Arrays.equals(disorderedArray, orderedArray);
    }
}
