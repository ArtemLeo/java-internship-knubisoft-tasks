package com.knubisoft.tasks.algorithm.search;

public interface Search {

    /**
     * Implement custom binary search algorithm
     *
     * @param array input data
     * @param v value to search
     * @return -1 if not found, otherwise position of element
     */
    int binarySearch(long[] array, long v);

}
