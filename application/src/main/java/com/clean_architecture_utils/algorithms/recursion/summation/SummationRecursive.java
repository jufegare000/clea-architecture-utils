package com.clean_architecture_utils.algorithms.recursion.summation;

public class SummationRecursive {

    public int sumNTerms(int n) {
        if (n == 0) {
            return 0;
        }
        return sumNTerms(n - 1) + n;
    }
}
