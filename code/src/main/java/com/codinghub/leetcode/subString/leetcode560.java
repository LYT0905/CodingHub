package com.codinghub.leetcode.subString;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 莱特0905
 * @Description: 和为 K 的子数组
 * @Date: 2024/08/16 20:26:28
 */
public class leetcode560 {
    public int subarraySum(int[] nums, int k) {
        int prefixSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        if (nums == null || nums.length == 0){
            return result;
        }
        map.put(0, 1);
        for (int num : nums) {
            prefixSum += num;
            if (map.containsKey(prefixSum - k)){
                result += map.get(prefixSum - k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return result;
    }
}
