package org.vijay.leetCodeTest;

import org.junit.Test;
import org.vijay.leetCode.LeetCode26;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode26Test {

    private final LeetCode26 leetCode26 = new LeetCode26();

    @Test
    public void testCase1 () {
        int[] tc1 = new int[]{1, 1, 2};
        int tc1Response = leetCode26.removeDuplicates(tc1);
        assertEquals(tc1Response, 2);
    }

    @Test
    public void testCase2 () {
        int[] tc2 = new int[] {0,0,1,1,1,2,2,3,3,4};
        int tc2Response = leetCode26.removeDuplicates(tc2);
        assertEquals(tc2Response, 5);
    }
}
