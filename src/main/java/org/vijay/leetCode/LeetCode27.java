package org.vijay.leetCode;

import java.util.Arrays;

public class LeetCode27 {
    public int removeElement(int[] nums, int val) {
        int valCnt = (int) Arrays.stream(nums).filter(f -> f == val).count();
        nums = sortArray (nums, val, valCnt);
        return nums.length - valCnt;
    }

    private int[] sortArray(int[] nums, int val, int valCnt) {
        int newArrCnt = nums.length - valCnt;
        int oldArrCnt = nums.length - 1;
        int[] tempArray = new int[newArrCnt];

        int i = 0;
        while (oldArrCnt >= 0) {
            if (val != nums[oldArrCnt]) {
                tempArray[i++] = nums[oldArrCnt];
            }
            --oldArrCnt;
        }
        System.out.println("Array print");
        Arrays.stream(tempArray).forEach(System.out::println);
        return tempArray;
    }

    public int removeElement1(int[] nums, int val) {
        int newArrCnt = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[newArrCnt++] = nums[i];
            }
        }
        System.out.println("Array print");
        Arrays.stream(nums).forEach(System.out::println);
        return newArrCnt;
    }
}
