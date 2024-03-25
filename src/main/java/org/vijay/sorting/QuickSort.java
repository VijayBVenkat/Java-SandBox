package org.vijay.sorting;

import java.util.Random;

public class QuickSort {

    //uses recursive approach

    public static void main(String[] args) {

        Random rand = new Random();
        int[] inputArray = new int[10];

        for (int i=0; i<inputArray.length; i++) {
            inputArray[i] = rand.nextInt(100);
        }

        printArray ("Input", inputArray);
        long startTime = System.currentTimeMillis();

        quickSort (inputArray);

        printArray ("Output", inputArray);

    }

    private static void quickSort (int[] inputArray) {
        quickSort(inputArray, 0, inputArray.length - 1);
    }

    private static void quickSort(int[] inputArray, int lowIndex, int highIndex) {

        if (lowIndex > highIndex) {
            return;
        }
        int pivotVal = inputArray[highIndex];

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (inputArray[leftPointer] <= pivotVal && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (inputArray[rightPointer] >= pivotVal && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap (inputArray, leftPointer, rightPointer);
        }
        swap (inputArray, leftPointer, highIndex);

        quickSort(inputArray, lowIndex, leftPointer - 1);
        quickSort(inputArray, leftPointer + 1, highIndex);

    }

    private static void swap (int[] inputArray, int leftPointer, int rightPointer) {
        int tempVal = inputArray[leftPointer];
        inputArray[leftPointer] = inputArray[rightPointer];
        inputArray[rightPointer] = tempVal;
    }

    private static void printArray (String key, int[] arr) {
        System.out.println(key);
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println(" ");
    }
}
