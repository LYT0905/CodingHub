package com.codinghub.leetcode.window;

import java.util.*;

/**
 * @author 莱特0905
 * @Description: 找到字符串中所有字母异位词
 * @Date: 2024/08/14 19:37:44
 */
public class leetcode438 {
    public List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();
        List<Integer> result = new ArrayList<>();
        if (sLen < pLen){
            return result;
        }
        int[] sChar = new int[26];
        int[] pChar = new int[26];
        for (int i = 0; i < pLen; i++) {
            pChar[p.charAt(i) - 'a']++;
        }
        for (int r = 0, l = 0; r < sLen; r++) {
            sChar[s.charAt(r) - 'a']++;
            if (r - l + 1 > pLen){
                sChar[s.charAt(l) - 'a']--;
                l++;
            }
            if(check(sChar, pChar)){
                result.add(l);
            }
        }
        return result;
    }

    private boolean check(int[] sChar, int[] pChar) {
        for (int i = 0; i < 26; i++){
            if (sChar[i] != pChar[i]){
                return false;
            }
        }
        return true;
    }
}
