package org.vijay.sorting;

import java.util.Random;

public class MergeSort {

    //uses recursive approach

    static int cnt = 1;

    public static void main(String[] args) {

        Random rand = new Random();
        int[] inputArray = new int[100];

        for (int i=0; i<inputArray.length; i++) {
            inputArray[i] = rand.nextInt(10000);
        }
//        inputArray[0] = 7;
//        inputArray[1] = 5;
//        inputArray[2] = 2;

        printArray ("Input", inputArray);
        long startTime = System.currentTimeMillis();

        mergeSort(inputArray);

        long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println("Time taken: " + timeTaken);
        printArray("Output", inputArray);
    }

    public void mergeSortFromOut (int[] inputArray) {
        mergeSort(inputArray);
    }

    private static void mergeSort(int[] inputArray) {
//        printArray("MS " + cnt++, inputArray);

        int inputSize = inputArray.length;

        if (inputSize < 2) {
            return;
        }

        int midIndex = inputSize / 2;

        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[inputSize - midIndex];

        for (int i=0; i<midIndex; i++) {
            leftArray[i] = inputArray[i];
        }
        for (int i=midIndex; i<inputSize; i++) {
            rightArray[i - midIndex] = inputArray[i];
        }
//        printArray("Left", leftArray);
//        printArray("Right", rightArray);

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(inputArray, leftArray, rightArray);

    }

    private static void merge (int[] inputArray, int[] leftArray, int[] rightArray) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                inputArray[k] = leftArray[i];
                i++;
            } else {
                inputArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            inputArray[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            inputArray[k] = rightArray[j];
            j++;
            k++;
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
