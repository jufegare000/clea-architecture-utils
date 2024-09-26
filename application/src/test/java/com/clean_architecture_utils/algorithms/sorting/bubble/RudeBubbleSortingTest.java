package com.clean_architecture_utils.algorithms.sorting.bubble;

import com.clean_architecture_utils.algorithms.sorting.RudeBubbleSorting;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RudeBubbleSortingTest {

    RudeBubbleSorting rudeBubbleSorting = new RudeBubbleSorting();

    int[] disorderedArray = {123, 12312, 3, 43, 4, 45, 213, 312, 213, 12, 321};
    int[] orderedArray = {3, 4, 12, 43, 45, 123, 213, 213, 312, 321, 12312};

    @Test
    public void testBubbleSorting() {
        rudeBubbleSorting.sort(disorderedArray);
        assert Arrays.equals(disorderedArray, orderedArray);
    }

    @Test
    public void sortAnArrayWithTwoElements() {
        int[] disorderedArray = {2, 1};
        int[] orderedArray = {1, 2};
        rudeBubbleSorting.bubbleSortAPelo(disorderedArray);
        assert Arrays.equals(disorderedArray, orderedArray);
    }

    @Test
    public void sortAnArrayWithThreeElements() {
        int[] disorderedArray = {2, 1, 4};
        int[] orderedArray = {1, 2, 4};
        rudeBubbleSorting.bubbleSortAPelo(disorderedArray);
        assert Arrays.equals(disorderedArray, orderedArray);
    }

    @Test
    public void sortAnArrayWithTenElements() {
        int[] disorderedArray = {2, 1, 4, 15, 900, 1999, 0, 99, 19};
        int[] orderedArray = {0, 1, 2, 4, 15, 19, 99, 900, 1999};
        rudeBubbleSorting.bubbleSortAPelo(disorderedArray);
        assert Arrays.equals(disorderedArray, orderedArray);
    }
}
