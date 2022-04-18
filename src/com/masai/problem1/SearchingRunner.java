package com.masai.problem1;

public class SearchingRunner {

    public static void main(String[] args) {

        int[] arr = {1,3,2};

        int target = 3;

        Sorting s = new BubbleSort();   //one can have selection sort as well, as it is loosely coupled
        s.sort(arr);

        BinarySearch b = new BinarySearch();
        b.binarySearch(arr,target);

    }

}
