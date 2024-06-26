package org.vijay.leetCode;

public class TwoSum {

    public static void main(String[] args) {
        int[] inputArray1 = {3, 2};
        int target = 6;
        int[] resultArray = twoSum(inputArray1, target);

        System.out.println(resultArray[0] + " " + resultArray[1]);
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] resultArray = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    resultArray[0] = i;
                    resultArray[1] = j;
                }
            }
        }
        return resultArray;
    }
}
