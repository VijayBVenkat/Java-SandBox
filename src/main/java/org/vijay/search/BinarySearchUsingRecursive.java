package org.vijay.search;

import org.vijay.sorting.MergeSort;

import java.util.Random;

public class BinarySearchUsingRecursive {

    // Read before checking
    // Tried with recursive approach - but, this wouldn't work

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

        System.out.println("Search Value present at: " + searchIndex);
    }

    private static int binarySearch (int [] inpArray, int searchVal) {

        int inputLength = inpArray.length;
        int retIndex = -1;
        if (inputLength == 1) {
            if (inpArray[0] != searchVal) {
                retIndex = -1;
            } else {
                retIndex = inputLength - 1;
            }
        } else {
            int midIndex = inputLength / 2;
            int[] leftArray = new int[midIndex];
            int[] rightArray = new int[inputLength - midIndex];
            if (searchVal < inpArray[midIndex]) {
                for (int i = 0; i < midIndex; i++) {
                    leftArray[i] = inpArray[i];
                }
                return binarySearch(leftArray, searchVal);
            } else {
                for (int i = midIndex; i < inputLength; i++) {
                    rightArray[i - midIndex] = inpArray[i];
                }
                return binarySearch(rightArray, searchVal);
            }
        }
        return retIndex;
    }

    private static void printArray (String key, int[] arr) {
        System.out.println(key);
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println(" ");
    }
}
