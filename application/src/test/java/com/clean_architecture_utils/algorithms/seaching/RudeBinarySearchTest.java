package com.clean_architecture_utils.algorithms.seaching;

import com.clean_architecture_utils.algorithms.searching.binary.RudeBinarySearch;
import org.junit.jupiter.api.Test;

public class RudeBinarySearchTest {

    int[] array = {1, 3, 32, 42, 62, 87, 100, 1000};

    RudeBinarySearch binarySearch = new RudeBinarySearch();

    @Test
    public void theresNotElementInArray() {
        int nonexistentElement = 666;
        int result = binarySearch.findIntElement(nonexistentElement, array);
        assert result == -1;
    }

    @Test
    public void findTheFirstElement() {
        int existingElement = 1;
        int result = binarySearch.findIntElement(existingElement, array);
        assert result == 0;
    }


    @Test
    public void findTheLastElement() {
        int nonexistentElement = 1000;
        int result = binarySearch.findIntElement(nonexistentElement, array);
        assert result == 7;
    }

}
