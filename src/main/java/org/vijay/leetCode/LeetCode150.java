package org.vijay.leetCode;

import java.util.Arrays;
import java.util.Stack;

public class LeetCode150 {
    public int evalRPN(String[] tokens) {
        int val = 0;
        int i = 0;
        while (i <= tokens.length - 2 && i >= 0) {
            String s1 = tokens[i];
            String s2 = tokens[i+1];
            String s3 = tokens[i+2];

            if (!(s3.equals("+") || s3.equals("-") || s3.equals("*") || s3.equals("/"))) {
                ++i;
            } else {
                switch (s3) {
                    case "+":
                        val = Integer.parseInt(s1) + Integer.parseInt(s2);
                        tokens[i] = String.valueOf(val);
                        tokens = resizeArray(tokens, i);
                        i = 0;
                        break;
                    case "-":
                        val = Integer.parseInt(s1) - Integer.parseInt(s2);
                        tokens[i] = String.valueOf(val);
                        tokens = resizeArray(tokens, i);
                        i = 0;
                        break;
                    case "*":
                        val = Integer.parseInt(s1) * Integer.parseInt(s2);
                        tokens[i] = String.valueOf(val);
                        tokens = resizeArray(tokens, i);
                        i = 0;
                        break;
                    default:
                        val = Integer.parseInt(s1) / Integer.parseInt(s2);
                        tokens[i] = String.valueOf(val);
                        tokens = resizeArray(tokens, i);
                        i = 0;
                        break;
                }
                continue;
            }


        }
        int i1 = Integer.parseInt(tokens[0]);
        return i1;
    }

    private String[] resizeArray (String[] tempTokens, int i) {
        String[] tempArray = new String[tempTokens.length - 2];
        for (int j = i+1; j < tempTokens.length; j++) {
            if (i+3 < tempTokens.length) {
                tempTokens[j] = tempTokens[i + 3];
                ++i;
            }
        }
        tempArray = Arrays.copyOfRange(tempTokens, 0, tempTokens.length - 2);
        return tempArray;
    }

    class Solution {
        public int evalRPN(String[] tokens) {
            Stack<Integer> stack = new Stack<>();
            int num1, num2;
            for (String token : tokens) {
                if (token.equals("+"))  {
                    stack.push(stack.pop() + stack.pop());
                } else if (token.equals("-"))   {
                    num1 = stack.pop();
                    num2 = stack.pop();
                    stack.push(num2 - num1);
                } else if (token.equals("*"))   {
                    stack.push(stack.pop() * stack.pop());
                } else if (token.equals("/"))   {
                    num1 = stack.pop();
                    num2 = stack.pop();
                    stack.push(num2 / num1);
                } else  {
                    stack.push(Integer.parseInt(token));
                }
            }
            return stack.pop();
        }
    }

        public int evalRPN1(String[] tokens) {
            Stack<Integer> stack = new Stack<>();
            int num1, num2;
            for (String token : tokens) {
                if (token.equals("+"))  {
                    stack.push(stack.pop() + stack.pop());
                } else if (token.equals("-"))   {
                    num1 = stack.pop();
                    num2 = stack.pop();
                    stack.push(num2 - num1);
                } else if (token.equals("*"))   {
                    stack.push(stack.pop() * stack.pop());
                } else if (token.equals("/"))   {
                    num1 = stack.pop();
                    num2 = stack.pop();
                    stack.push(num2 / num1);
                } else  {
                    stack.push(Integer.parseInt(token));
                }
            }
            return stack.pop();
        }

}
