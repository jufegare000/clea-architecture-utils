package com.clean_architecture_utils.algorithms.seaching;

import com.clean_architecture_utils.algorithms.searching.sequential.RudeSequentialSearch;
import org.junit.jupiter.api.Test;

public class RudeSequentialSearchTest {

    int[] array = {23, 412, 3, 23, 3, 241232323, 23212321, 1321232323};

    RudeSequentialSearch rudeSequentialSearch = new RudeSequentialSearch();

    @Test
    public void findNonExistentElement() {
        int nonExistentElement = 666;
        int foundElement = rudeSequentialSearch.findIntElement(nonExistentElement, array);
        assert foundElement == -1;
    }

    @Test
    public void findFirstElement() {
        int firstElement = array[0];
        int foundElement = rudeSequentialSearch.findIntElement(firstElement, array);
        assert foundElement == 0;
    }

    @Test
    public void findLastElement() {
        int lastElement = array[array.length - 1];
        int foundElement = rudeSequentialSearch.findIntElement(lastElement, array);
        assert foundElement == array.length - 1;
    }
}
