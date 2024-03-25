package org.vijay.dsa.arrays;

public class PrintArray {

    public static void printArray (String key, int[] arr) {
        System.out.println(key);
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println(" ");
    }
}
