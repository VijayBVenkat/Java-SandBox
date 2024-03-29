package org.vijay.leetCode;

public class SearchInsertPosition {
    public static void main(String[] args) {

        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        } else if (nums.length == 1) {
            if (nums[0] < target) {
                return 1;
            } else {
                return -1;
            }
        }

        int index = callBinarySearch (nums, 0, nums.length-1, target);
        return index;

    }

    private static int callBinarySearch(int[] nums, int leftIndex, int rightIndex, int target) {
        int midIndex = (rightIndex + leftIndex) / 2;
        int valAtMid = nums[midIndex];

        if (valAtMid == target) {
            return midIndex;
        }

        if (valAtMid > target) {
            if (leftIndex == midIndex) {
                return leftIndex;
            }
            return callBinarySearch(nums, leftIndex, midIndex, target);
        } else {
            if (midIndex+1 > rightIndex) {
                return midIndex + 1;
            }
            return callBinarySearch(nums, midIndex+1, rightIndex, target);
        }
    }
}
