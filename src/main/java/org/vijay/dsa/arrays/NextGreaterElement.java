package org.vijay.dsa.arrays;

import java.util.Arrays;

public class NextGreaterElement {
    public static void main(String[] args) {

        PrintArray printer = new PrintArray();
        RandomArrayGenerator randomArrayGenerator = new RandomArrayGenerator(10, 100);
        int[] inputArray = randomArrayGenerator.generateArray();
//        int[] inputArray = {57, 70, 73, 81, 27, 48, 35, 10, 82, 92};
//        int[] inputArray = {64, 94, 78, 18, 34, 89, 81, 25, 58, 87};
        printer.printArray ("Input", inputArray);
        long startTime = System.currentTimeMillis();

        int[] resultArray = nextGreaterElementUsingArray (inputArray);

        long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println("Time taken: " + timeTaken);
        printer.printArray("Output", resultArray);
    }

    private static int[] nextGreaterElementUsingArray(int[] inputArray) {
        int[] resultArray = new int[inputArray.length];

        int inputLength = inputArray.length;
        for (int i = 0; i < inputLength; i++) {
            int nextVal = -1;
                resultArray[i] = nextVal;
            for (int j = i + 1; j < inputLength; j++) {
                if (nextVal < inputArray [j]) {
                    nextVal = inputArray [j];
                }
            }
            if (inputArray[i] < nextVal) {
                resultArray[i] = nextVal;
            }
        }
        return resultArray;
    }
}
