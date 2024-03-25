package org.vijay;

import org.vijay.leetCode.LeetCode27;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        int[] tc1 = new int[]{3, 2, 2, 3};
        int val = 3;

//        int[] tc2 = new int[]{0,1,2,2,3,0,4,2};
//        int val = 2;

        LeetCode27 lc27 = new LeetCode27();
        int rtn = lc27.removeElement1(tc1, val);
        System.out.println("rtn = " + rtn);

//        LeetCode383 lc383 = new LeetCode383();
//        boolean rtn = lc383.canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj");
//        System.out.println(rtn);

    }
}