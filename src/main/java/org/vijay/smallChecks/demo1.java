package org.vijay.smallChecks;

public class demo1 {

    public static void main(String[] args) {

        double rndm = Math.random();
        System.out.println("Random value: " + rndm);

        double rndm10 = rndm * 10;
        System.out.println("Random * 10: " + rndm10);

        long rndm10Long = Math.round(rndm10);
        System.out.println("Random * 10 Long: " + rndm10Long);

        int randomIndex = (int) rndm10Long;
        System.out.println("Random Int: " + randomIndex);

    }
}