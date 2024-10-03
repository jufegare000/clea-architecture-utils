package com.clean_architecture_utils.algorithms.sorting.selection.module;

public class SelectionSortV2 {

    public void sort(int[] arr) {
        SelectionSortData selectionSortData = setUpDataStructure(arr);
        for (int i = 0; i < selectionSortData.getSizeOfArray() - 1; i++) {
            runArrayInternallyBasedOnLatestIndex(selectionSortData, i);
            swapElementsOfArrayAfterInnerLoop(selectionSortData, i);
        }
    }

    public void runArrayInternallyBasedOnLatestIndex(SelectionSortData selectionSortData, int index){
        selectionSortData.updateSmallestElementIndex(index);
        for (int j = index + 1; j < selectionSortData.getSizeOfArray(); j++) {
            if (isCurrentElementGreaterThanTheCurrentSmallest(selectionSortData, j)) {
                selectionSortData.updateSmallestElementIndex(j);
            }
        }
    }

    public boolean isCurrentElementGreaterThanTheCurrentSmallest(SelectionSortData selectionSortData, int index){
        return selectionSortData.getElementOfArrayAtPosition(index) < selectionSortData.getSmallestElement();
    }

    public void swapElementsOfArrayAfterInnerLoop(SelectionSortData selectionSortData, int index){
        selectionSortData.swapArrayElementsBasedOnInnerLoop(index);
    }

    public SelectionSortData setUpDataStructure(int[] array) {
        return new SelectionSortData(array);
    }
}
