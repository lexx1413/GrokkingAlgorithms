package com.aseledtsov.algorithms.sorting;

public interface SortingAlgorithm {
    <T extends Comparable<? super T>> void sort(T[] a);
}
