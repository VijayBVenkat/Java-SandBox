package org.vijay.dsa.arrays;

public class MoveZeroesToEnd {

    public static void main(String[] args) {

        PrintArray printer = new PrintArray();

        int [] inputArray = {0, 2, 0, 5, 0, 7, 0, 1, 4, 8};

        printer.printArray ("Input", inputArray);

        moveZeroes (inputArray);
        printer.printArray ("Output", inputArray);
    }

    private static void moveZeroes(int[] inputArray) {

        int j = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != 0 && inputArray [j] == 0) {
                int tempVal = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = tempVal;
            }
            if (inputArray[j] != 0) {
                j++;
            }
        }

        }
    }
