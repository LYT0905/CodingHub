package com.codinghub.leetcode.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author 莱特0905
 * @Description: 两数之和
 * @Date: 2024/07/27 19:00:47
 */
public class leetcode01 {
    public int[] twoSum01(int[] nums, int target) {
        int n = nums.length;

        // 遍历每一对数字
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // 检查这两个数字的和是否等于目标值
                if (nums[i] + nums[j] == target) {
                    // 返回这两个数字的下标
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
    public int[] twoSum(int[] nums, int target) {
        // 创建一个哈希表来存储数组中的数字及其对应的索引
        Map<Integer, Integer> numToIndex = new HashMap<>();

        // 遍历数组中的每个数字
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;

            // 检查补数是否在哈希表中
            if (numToIndex.containsKey(complement)) {
                // 返回补数和当前数字的索引
                return new int[] { numToIndex.get(complement), i };
            }

            // 将当前数字和它的索引存入哈希表中
            numToIndex.put(num, i);
        }
        return null;
    }
}
