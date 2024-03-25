package org.vijay.dsa.queue;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryNumbers {

    public static void main(String[] args) {

        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String[] binaryNumbers = generateBinaryNumbers (num);

        Arrays.stream(binaryNumbers).forEach(System.out::println);

    }

    public static String[] generateBinaryNumbers (int num) {

        String[] result = new String[num];

        Queue<String> stringQueue = new LinkedList<>();

        stringQueue.offer("1");
        for (int i = 0; i < num; i++) {
            result [i] = stringQueue.poll();
            String num1 = result[i] + "0";
            stringQueue.offer(num1);
            String num2 = result[i] + "1";
            stringQueue.offer(num2);
        }
        return result;

    }

}
