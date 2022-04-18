package com.masai.problem1;

public interface Sorting {

    public void sort(int[] arr);

}

class BubbleSort implements Sorting{

    @Override
    public void sort(int[] arr) {
        System.out.println("Array Sorted using Bubble sort");
    }
}

class SelectionSort implements Sorting{

    @Override
    public void sort(int[] arr) {
        System.out.println("Array sorted using Selection Sort");
    }
}

