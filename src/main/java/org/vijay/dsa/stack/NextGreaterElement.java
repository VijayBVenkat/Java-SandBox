package org.vijay.dsa.stack;

import org.vijay.dsa.arrays.PrintArray;
import org.vijay.dsa.arrays.RandomArrayGenerator;

public class NextGreaterElement {

    public static void main(String[] args) {

        PrintArray printer = new PrintArray();
        RandomArrayGenerator randomArrayGenerator = new RandomArrayGenerator(10, 100);
        int[] inputArray = randomArrayGenerator.generateArray();

        printer.printArray ("Input", inputArray);
        long startTime = System.currentTimeMillis();

        int[] resultArray = nextGreaterElementUsingStack (inputArray);

        long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println("Time taken: " + timeTaken);
        printer.printArray("Output", resultArray);
    }

    private static int[] nextGreaterElementUsingStack(int[] inputArray) {
        int[] resultArray = new int[inputArray.length];



        return resultArray;

    }
}
