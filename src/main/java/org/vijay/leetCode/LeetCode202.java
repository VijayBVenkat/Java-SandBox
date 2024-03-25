package org.vijay.leetCode;

public class LeetCode202 {
    public boolean isHappy(int n) {
        int tempN = n;
        int sumSquare = n;
        if (n==1 || n==7) {
            return true;
        }
        int cnt = 1;
        while (sumSquare > 9) {
            sumSquare = 0;
            while (tempN != 0) {
                int digit = tempN % 10;
                sumSquare += (digit * digit);
                tempN /= 10;
            }
            if (sumSquare ==1 || sumSquare==7) {
                return true;
            }
            tempN = sumSquare;
        }
        return false;
    }
}
