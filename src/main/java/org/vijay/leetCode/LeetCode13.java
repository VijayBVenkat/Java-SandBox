package org.vijay.leetCode;

import java.util.HashMap;
import java.util.Map;

//Roman to Int
public class LeetCode13 {

    public int romanToIntOld(String s) {

        int strLen = s.length();
        int val = 0;
        for (int i = 0; i < strLen; i++) {
            char currentChar = s.charAt(i);
            char nextChar = currentChar;
            if (i < strLen-1) {
                nextChar = s.charAt(i + 1);
            }
            if ("I".equals(String.valueOf(currentChar))) {
                if (i < strLen - 1 && "V".equals(String.valueOf(nextChar))) {
                    val = val + 4;
                    i++;
                } else if (i < strLen - 1 && "X".equals(String.valueOf(nextChar))) {
                    val = val + 9;
                    i++;
                } else {
                    val++;
                }
            } else if ("V".equals(String.valueOf(currentChar))) {
                val = val + 5;
            } else if ("X".equals(String.valueOf(currentChar))) {
                if (i < strLen - 1 && "L".equals(String.valueOf(nextChar))) {
                    val = val + 40;
                    i++;
                } else if (i < strLen - 1 && "C".equals(String.valueOf(nextChar))) {
                    val = val + 90;
                    i++;
                } else {
                    val = val + 10;
                }
            } else if ("L".equals(String.valueOf(currentChar))) {
                val = val + 50;
            } else if ("C".equals(String.valueOf(currentChar))) {
                if (i < strLen - 1 && "D".equals(String.valueOf(nextChar))) {
                    val = val + 400;
                    i++;
                } else if (i < strLen - 1 && "M".equals(String.valueOf(nextChar))) {
                    val = val + 900;
                    i++;
                } else {
                    val = val + 100;
                }
            } else if("D".equals(String.valueOf(currentChar))) {
                val = val + 500;
            } else if("M".equals(String.valueOf(currentChar))) {
                val = val + 1000;
            }

        }
        System.out.println(val);
        return val;
    }

    public int romanToInt(String s) {
        Map<String, Integer> romanMap = new HashMap<>();
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);

        int result = 0;
        int prevVal = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currVal = romanMap.get(String.valueOf(s.charAt(i)));
            if (currVal < prevVal) {
                result -= currVal;
            } else {
                result += currVal;
            }
            prevVal = currVal;
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        LeetCode13 leetCode13 = new LeetCode13();
        leetCode13.romanToInt("MCMXCIV");
    }


}
