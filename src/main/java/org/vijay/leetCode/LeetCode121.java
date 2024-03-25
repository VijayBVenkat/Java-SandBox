package org.vijay.leetCode;

import java.util.*;

public class LeetCode121 {

    public int maxProfit(int[] prices) {

        List<Integer> diffValList = new ArrayList<>();
        diffValList.add(0);
        for (int i = 0; i< prices.length; i++) {
            int startVal = prices[i];
            if (i < prices.length - 1) {

//                diffValList.add(Arrays.stream(prices, i+1, prices.length)
//                        .max()
//                        .orElse(0) - startVal);

                int[] newArr = Arrays.copyOfRange(prices, i + 1, prices.length);
                diffValList.add(Arrays.stream(newArr).max().getAsInt() - startVal);
            }
        }

        return Math.max(0, Collections.max(diffValList));

    }

    public static void main(String[] args) {

        LeetCode121 leetCode121 = new LeetCode121();
        int[] tc1 = new int[]{2, 10, 1, 3};
        int result = leetCode121.maxProfit(tc1);
        System.out.println("Result: " + result);
    }
}
