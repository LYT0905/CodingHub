package com.codinghub.leetcode.hash;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author 莱特0905
 * @Description: 最长连续序列
 * @Date: 2024/08/01 19:40:06
 */
public class leetcode128 {
    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int result = 0;
        for (int num : nums) {
            int current = num;
            if (!set.contains(current - 1)){
                while (set.contains(current + 1)){
                    current++;
                }
            }
            result = Math.max(result, current - num + 1);
        }
        return result;
    }
}
