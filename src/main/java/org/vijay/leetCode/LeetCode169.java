package org.vijay.leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

// Majority element
public class LeetCode169 {

    public int majorityElement(int[] nums) {
        int len = nums.length;
        Map<Integer, Long> cntMap = new HashMap<>();

        cntMap = Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(k -> k,
                        Collectors.counting()));

        for (Integer i : cntMap.keySet()) {
            if (cntMap.get(i).intValue() > len / 2) {
                return i;
            }
        }
        return 0;
    }

}

