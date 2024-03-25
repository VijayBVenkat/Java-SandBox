package org.vijay.inputFromUser;

import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {

        System.out.println("Enter the number:");

        Scanner sc = new Scanner(System.in);
        int inputInt = sc.nextInt();
        System.out.println(inputInt);

    }
}
