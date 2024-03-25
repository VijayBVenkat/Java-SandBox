package org.vijay.sorting;

import java.util.Random;

public class InsertionSort {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] inputArray = new int[10];

        for (int i=0; i<inputArray.length; i++) {
            inputArray[i] = rand.nextInt(100);
        }

        printArray ("Input", inputArray);
        long startTime = System.currentTimeMillis();

        insertionSort(inputArray);

        printArray ("Output", inputArray);
    }

    private static void insertionSort(int[] inputArray) {

        for (int i = 1; i < inputArray.length; i++) {
            int tempVal = inputArray[i];

            int j  = i - 1;
            while (j >= 0 && inputArray[j] > tempVal) {
                inputArray [j + 1] = inputArray [j];
                j--;
            }
            inputArray[j+1] = tempVal;
        }
    }

    private static void printArray (String key, int[] arr) {
        System.out.println(key);
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println(" ");
    }
}
