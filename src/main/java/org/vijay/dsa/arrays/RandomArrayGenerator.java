package org.vijay.dsa.arrays;

import java.util.Random;

public class RandomArrayGenerator {

    private static int arrayLength = 10;
    private static int arrayBound = 100;
    public RandomArrayGenerator (int arrayLength, int arrayBound) {
        this.arrayLength = arrayLength;
        this.arrayBound = arrayBound;
    }

    public int[] generateArray() {
        Random rand = new Random();
        int[] inputArray = new int[arrayLength];

        for (int i=0; i<inputArray.length; i++) {
            inputArray[i] = rand.nextInt(arrayBound);
        }
        return inputArray;
    }
}
