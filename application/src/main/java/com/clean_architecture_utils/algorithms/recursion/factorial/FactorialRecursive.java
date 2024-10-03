package com.clean_architecture_utils.algorithms.recursion.factorial;

public class FactorialRecursive {

    public int calculate(int term) {
        if (term == 0 || term == 1) {
            return 1;
        } else {
            return calculate(term - 1) * term;
        }
    }
}
