package org.vijay.leetCode;

import java.util.Stack;

public class LeetCode26 {
    public int removeDuplicates(int[] nums) {

        int len = nums.length;
        int newIndex = 0;

        for (int i = 0; i < len; i++) {
            if (i == 0) {
                nums[newIndex++] = nums[i];
            } else {
                if (nums[newIndex-1] != nums[i]) {
                    nums[newIndex++] = nums[i];
                }
            }
        }
        return newIndex;

    }
}
