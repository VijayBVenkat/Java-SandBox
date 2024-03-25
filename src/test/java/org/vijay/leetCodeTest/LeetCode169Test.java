package org.vijay.leetCodeTest;

import org.junit.jupiter.api.Test;
import org.vijay.leetCode.LeetCode169;

import static org.junit.Assert.assertEquals;

public class LeetCode169Test {

    private final LeetCode169 leetCode169 = new LeetCode169();

    @Test
    public void testCase1() {

        int[] tc1 = new int[]{3, 2, 3};
        int tc1Response = leetCode169.majorityElement(tc1);
        assertEquals(3, tc1Response);
    }

    public void testCase2() {
        int[] tc2 = new int[] {2,2,1,1,1,2,2};
        int tc2Response = leetCode169.majorityElement(tc2);
        assertEquals(2, tc2Response);
    }

}
