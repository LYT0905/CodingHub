package com.codinghub.leetcode.array;

import java.util.Map;

/**
 * @author 莱特0905
 * @Description: 最大子数组和
 * @Date: 2024/08/26 21:51:33
 */
public class leetcode53 {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        if (nums == null || nums.length == 0){
            return sum;
        }
        int result = nums[0];
        for (int num : nums) {
            if (sum >= 0){
                sum += num;
            }else {
                sum = num;
            }
            result = Math.max(result, sum);
        }
        return result;
    }
}
