package org.vijay.search;

import org.vijay.sorting.MergeSort;

import java.util.Random;

public class BinarySearch {

    public static void main(String[] args) {

        int [] inputArray = new int[10];
        Random rand = new Random();

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = rand.nextInt(100);
        }

        printArray ("Unsorted Input", inputArray);

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSortFromOut(inputArray);

        printArray("Sorted Input", inputArray);

        int searchVal = rand.nextInt(100);
        System.out.println("Search Value: " + searchVal);

        int searchIndex = binarySearch (inputArray, searchVal);

        if (searchIndex == -1) {
            System.out.println("Search value not present in the array");
        } else {
            System.out.println("Search Value present at: " + searchIndex);
        }
    }

    private static int binarySearch(int[] inputArray, int searchVal) {
        int lowIndex = 0;
        int highIndex = inputArray.length - 1;

        while (lowIndex < highIndex) {
            int midIndex = (highIndex + lowIndex) / 2;
            int midVal = inputArray[midIndex];
            if (searchVal == midVal) {
                return midIndex;
            } else {
                if (searchVal < midVal) {
                    highIndex = midIndex - 1;
                } else {
                    lowIndex = midIndex + 1;
                }
            }
        }
        return -1;
    }

    private static void printArray (String key, int[] arr) {
        System.out.println(key);
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println(" ");
    }
}
