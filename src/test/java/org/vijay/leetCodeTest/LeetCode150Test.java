package org.vijay.leetCodeTest;

import org.junit.jupiter.api.Test;
import org.vijay.leetCode.LeetCode150;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode150Test {
    private final LeetCode150 leetCode150 = new LeetCode150();

    @Test
    public void testCase1() {
        String[] tc1 = new String[] {"2", "1", "+", "3", "+"};
        assertEquals(6, leetCode150.evalRPN(tc1));
    }

    public void testCase2() {
        String[] inputArray = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        assertEquals(22, leetCode150.evalRPN(inputArray));
    }
}
