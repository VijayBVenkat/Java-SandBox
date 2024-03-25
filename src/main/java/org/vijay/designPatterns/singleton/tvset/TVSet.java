package org.vijay.designPatterns.singleton.tvset;

public class TVSet {

    private static volatile TVSet tvSet;

    private TVSet() {
        System.out.println("TVSet constructor");
    }

    public static TVSet getTvSet() {
        if (tvSet == null) {
            synchronized (TVSet.class) {
                if (tvSet == null) {
                    tvSet = new TVSet();
                }
            }
        }
        return tvSet;
    }
}
