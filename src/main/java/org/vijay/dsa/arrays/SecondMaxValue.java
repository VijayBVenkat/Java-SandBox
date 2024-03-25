package org.vijay.dsa.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class SecondMaxValue {

    public static void main(String[] args) {
        PrintArray printer = new PrintArray();
        RandomArrayGenerator randomArrayGenerator = new RandomArrayGenerator(10, 100);
        int[] inputArray = randomArrayGenerator.generateArray();

        printer.printArray ("Input", inputArray);
        long startTime = System.currentTimeMillis();

        int secondMax = Arrays.stream(inputArray)
                            .boxed()
                            .sorted((a, b) -> b - a)
                            .distinct()
                            .skip(1)
                            .findFirst()
                            .orElse(-1);

        long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println("Time taken: " + timeTaken);

        System.out.println("Second Max Value: " + secondMax);

    }
}
