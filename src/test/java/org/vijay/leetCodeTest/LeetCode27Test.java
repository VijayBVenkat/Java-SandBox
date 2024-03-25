package org.vijay.leetCodeTest;

import org.junit.Test;
import org.vijay.leetCode.LeetCode27;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LeetCode27Test {

    private final LeetCode27 leetCode27 = new LeetCode27();

    @Test
    public void testCase1 () {
        int[] tc1 = new int[]{3, 2, 2, 3};
        int val = 3;
        leetCode27.removeElement(tc1, val);
        int[] tc1Out = new int[]{3, 2, 2, 3};
        assertArrayEquals(tc1Out, tc1);
    }

    public void testCase2 () {
        int[] tc2 = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;
        leetCode27.removeElement(tc2, val);
    }

    //        int[] tc1 = new int[]{3,2, 2, 3};
//        int val = 3;

//        int[] tc2 = new int[]{0,1,2,2,3,0,4,2};
//        int val = 2;
//
//        LeetCode27 lc27 = new LeetCode27();
//        int rtn = lc27.removeElement(tc2, val);
//        System.out.println("rtn = " + rtn);

}
