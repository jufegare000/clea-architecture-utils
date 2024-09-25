package com.clean_architecture_utils.algorithms.searching.binary.module;

import com.clean_architecture_utils.algorithms.searching.binary.BinarySearchData;

public class BinarySearchPresenterImplemented implements BinarySearchPresenter {

    private BinarySearchMapper binarySearchMapper;
    private BinarySearchOperator operator;

    public BinarySearchPresenterImplemented(BinarySearchMapper binarySearchMapper, BinarySearchOperator operator) {
        this.binarySearchMapper = binarySearchMapper;
        this.operator = operator;
    }

    @Override
    public int findElementUsingBinarySearch(int[] arr, int element) {
        return operator.performBinarySearch(setUpBinarySearchStructure(arr, element));
    }

    public BinarySearchData setUpBinarySearchStructure(int[] arr, int element) {
        return binarySearchMapper.setUpData(arr, element);
    }

}
