package org.vijay.leetCode;

public class LeetCode189 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] newArr = new int[len];
        for (int i = k; i < len-1; i++) {

        }
        for (int i = len-1; i >= k; i--) {
            newArr[i-k] = nums[i];
        }
    }
}
