package org.vijay.leetCode;

import java.awt.image.ImageFilter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int rLen = ransomNote.length();
        int mLen = magazine.length();
        boolean rtn = false;
        if (mLen < rLen) {
            return  rtn;
        }
        Map<String, Integer> magCharCount = new HashMap<>();
        for (int i = 0; i < mLen; i++) {
            if (!magCharCount.containsKey(String.valueOf(magazine.charAt(i)))) {
                magCharCount.put(String.valueOf(magazine.charAt(i)), 1);
            } else {
                int charCnt = magCharCount.get(String.valueOf(magazine.charAt(i))) + 1;
                magCharCount.put(String.valueOf(magazine.charAt(i)), charCnt);
            }
        }

        Map<String, Integer> ranCharCount = new HashMap<>();
        for (int i = 0; i < rLen; i++) {
            if (!ranCharCount.containsKey(String.valueOf(ransomNote.charAt(i)))) {
                ranCharCount.put(String.valueOf(ransomNote.charAt(i)), 1);
            } else {
                int charCnt = ranCharCount.get(String.valueOf(ransomNote.charAt(i))) + 1;
                ranCharCount.put(String.valueOf(ransomNote.charAt(i)), charCnt);
            }
        }

        int cnt = 0;
        for (Map.Entry<String, Integer> ranEntry : ranCharCount.entrySet()) {
            if ((!magCharCount.containsKey(ranEntry.getKey())) ||
                    (magCharCount.containsKey(ranEntry.getKey()) &&
                            magCharCount.get(ranEntry.getKey()) < ranEntry.getValue())) {
                rtn = false;
            } else {
                cnt++;
            }
        }
        if (ranCharCount.keySet().size() == cnt) {
            rtn = true;
        }
        return rtn;
    }

    public boolean canConstruct1(String ransomNote, String magazine) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(int i =0; i<magazine.length();i++){
            arr1[magazine.charAt(i)-'a']++;
        }

        for(int i =0; i<ransomNote.length();i++){
            arr2[ransomNote.charAt(i)-'a']++;
        }

        for(int i =0; i<26; i++){
            if(arr1[i]<arr2[i]){
                return false;
            }
        }
        return true;
    }
}
