package org.vijay.designPatterns.singleton.tvset;

public class Driver {
    public static void main(String[] args) {

        TVSet member1 = TVSet.getTvSet();
        TVSet member2 = TVSet.getTvSet();

        System.out.println(member1);
        System.out.println(member2);
    }
}
