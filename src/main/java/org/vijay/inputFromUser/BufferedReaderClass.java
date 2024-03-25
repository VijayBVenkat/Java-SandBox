package org.vijay.inputFromUser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderClass {

    public static void main(String[] args) throws IOException {

        tryWithFinally();

        tryWithResources();

    }

    private static void tryWithResources() {
        System.out.println("Enter the number:");
        int inputInt = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            inputInt = Integer.parseInt(br.readLine());
            System.out.println(inputInt);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finally!");
        }
    }

    private static void tryWithFinally() throws IOException {
        System.out.println("Enter the number:");
        int inputInt = 0;
        BufferedReader br = null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);
            inputInt = Integer.parseInt(br.readLine());
            System.out.println(inputInt);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finally!");
            br.close();
        }
    }
}
