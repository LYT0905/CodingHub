package com.codinghub.leetcode.window;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 莱特0905
 * @Description: 无重复字符的最长子串
 * @Date: 2024/08/12 21:02:48
 */
public class leetcode03 {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        if (s == null || s.equals("")){
            return result;
        }
        int left = -1;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                left = Math.max(left, map.get(s.charAt(i)));
            }
            map.put(s.charAt(i), i);
            result = Math.max(result, i - left);
        }
        return result;
    }
}
