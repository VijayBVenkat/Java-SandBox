package org.vijay.dsa.stack;

import org.vijay.dsa.arrays.PrintArray;
import org.vijay.dsa.arrays.RandomArrayGenerator;

import java.util.Arrays;
import java.util.Random;

public class ReverseArray {

    public static void main(String[] args) {

        PrintArray printer = new PrintArray();
        RandomArrayGenerator randomArrayGenerator = new RandomArrayGenerator(10, 100);
        int[] inputArray = randomArrayGenerator.generateArray();

        printer.printArray ("Input", inputArray);
        long startTime = System.currentTimeMillis();

        reverseArray (inputArray);

        long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println("Time taken: " + timeTaken);
        printer.printArray("Output", inputArray);
    }

    private static void reverseArray(int[] inputArray) {

        int start = 0;
        int end = inputArray.length - 1;

        while (start < end) {
            int temp = inputArray[end];
            inputArray[end] = inputArray[start];
            inputArray[start] = temp;
            start++;
            end--;
        }

    }

}
