package org.vijay.dsa.arrays;

public class MinValue {
    public static void main(String[] args) {

        PrintArray printer = new PrintArray();
        RandomArrayGenerator randomArrayGenerator = new RandomArrayGenerator(10, 100);
        int[] inputArray = randomArrayGenerator.generateArray();

        printer.printArray ("Input", inputArray);
        long startTime = System.currentTimeMillis();

        int minVal = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minVal) {
                minVal = inputArray[i];
            }
        }

        long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println("Time taken: " + timeTaken);

        System.out.println("Min Value: " + minVal);

    }
}
