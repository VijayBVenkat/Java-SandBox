package org.vijay.leetCodeTest;

import org.junit.jupiter.api.Test;
import org.vijay.leetCode.LeetCode202;

import static org.junit.jupiter.api.Assertions.*;

public class LeetCode202Test {

    private final LeetCode202 leetCode202 = new LeetCode202();

    @Test
    public void testIsHappyWithHappyNumber() {
        assertTrue(leetCode202.isHappy(19));
        assertTrue(leetCode202.isHappy(7));
    }

    @Test
    public void testIsHappyWithUnhappyNumber() {
        assertFalse(leetCode202.isHappy(2));
        assertFalse(leetCode202.isHappy(123));
    }

    @Test
    public void testIsHappyWithSingleDigitNumbers() {
        assertTrue(leetCode202.isHappy(1));
        assertFalse(leetCode202.isHappy(2));
        assertFalse(leetCode202.isHappy(3));
        assertTrue(leetCode202.isHappy(7));
        assertFalse(leetCode202.isHappy(8));
        assertFalse(leetCode202.isHappy(9));
    }

    // Add more test cases as needed...

}

