package com.clean_architecture_utils.algorithms.searching.binary.module;

import com.clean_architecture_utils.algorithms.searching.binary.BinarySearchData;

public interface BinarySearchMapper {

    BinarySearchData setUpData(int[] arr, int element);

    int calculateHalfOfSegment(BinarySearchData binarySearchData);

    int getElementFromTheMiddle(BinarySearchData binarySearchData);
}
