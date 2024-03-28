package org.vijay.leetCode;

public class PalindromeNumber {

    public static void main(String[] args) {
        boolean result = isPalindrome(1234543210);
        System.out.println(result);
    }

    public static boolean isPalindrome(int x) {
        String inputStr = String.valueOf(x);
        char[] inputStrArr = inputStr.toCharArray();
        int left = 0;
        int right = inputStrArr.length - 1;
        while (left < right) {
            if (inputStrArr[left] != inputStrArr[right]) {
                return  false;
            }
            left++;
            right--;
        }
        return true;
    }
}
