package com.clean_architecture_utils.algorithms.seaching;

import com.clean_architecture_utils.algorithms.searching.binary.CleanBinarySearch;
import org.junit.jupiter.api.Test;

public class CleanBinarySearchTest {

    int[] array = {1, 3, 32, 42, 62, 87, 100, 1000};
    CleanBinarySearch cleanBinarySearch = new CleanBinarySearch();

    @Test
    public void theresNotElementInArray() {
        int nonexistentElement = 666;
        int result = cleanBinarySearch.findIntElement(nonexistentElement, array);
        assert result == -1;
    }

    @Test
    public void findFirstElement() {
        int existingElement = 1;
        int result = cleanBinarySearch.findIntElement(existingElement, array);
        assert result == 0;
    }


    @Test
    public void findLastElement() {
        int lastElement = 1000;
        int result = cleanBinarySearch.findIntElement(lastElement, array);
        assert result == array.length - 1;
    }
}
