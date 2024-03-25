package org.vijay.dsa.stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack {

    public static void main(String[] args) {

        System.out.println("Enter the string:");

        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        System.out.println("Input String: " + inputString);

        String reversedString = reverseString (inputString);

        System.out.println("Reversed String: " + reversedString);

    }

    private static String reverseString(String inputString) {
        Stack <Character> charStack = new Stack();
        char[] charArray = inputString.toCharArray();

        for (char c : charArray) {
            charStack.push(c);
        }

        for (int i = 0; i < inputString.length(); i++) {
            charArray[i] = charStack.pop();
        }

        return new String(charArray);

    }
}
