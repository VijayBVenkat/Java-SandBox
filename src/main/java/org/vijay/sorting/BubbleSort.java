package org.vijay.sorting;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {

        Random rand = new Random();
        int arrayLength = 10;
        int randomBound = 100;
        int[] inputArray = new int[arrayLength];

        for (int i=0; i<inputArray.length; i++) {
            inputArray[i] = rand.nextInt(randomBound);
        }

        int[] inputArray2 = Arrays.copyOf(inputArray, arrayLength);
        printArray ("Input", inputArray);
        long startTime = System.currentTimeMillis();

        bubbleSort(inputArray);

        long timeTaken = System.currentTimeMillis() - startTime;
        if (timeTaken > 1000) {
            timeTaken = timeTaken / 1000;
            System.out.println("Time taken: " + timeTaken + "s");
        } else {
            System.out.println("Time taken: " + timeTaken);
        }
        printArray("Output", inputArray);


// Option-2
        printArray ("Input", inputArray2);
        long startTime2 = System.currentTimeMillis();

        bubbleSortOption2(inputArray2);

        long timeTaken2 = System.currentTimeMillis() - startTime2;
        if (timeTaken2 > 1000) {
            timeTaken2 = timeTaken2 / 1000;
            System.out.println("Time taken: " + timeTaken2 + "s");
        } else {
            System.out.println("Time taken: " + timeTaken2);
        }
        printArray("Output", inputArray2);

    }

    private static void bubbleSort(int[] inputArray) {
        int inputLength = inputArray.length;
        int outerloop = inputLength;
        while (outerloop > 0 ) {
            for (int i = 0; i < inputLength - 1; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    int tempVal = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = tempVal;
                }
            }
            outerloop--;
        }

    }

    private static void bubbleSortOption2(int[] inputArray) {
        int inputLength = inputArray.length;
        boolean swappedDone = true;
        while (swappedDone) {
            swappedDone = false;
            for (int i = 0; i < inputLength - 1; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    swappedDone = true;
                    int tempVal = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = tempVal;
                }
            }
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
