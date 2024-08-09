package com.codinghub.leetcode.doublePointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 莱特0905
 * @Description: 三数之和
 * @Date: 2024/08/08 22:57:18
 */
public class leetcode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums == null || nums.length == 0){
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                return result;
            }
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (right > left){
                if (nums[right] + nums[left] + nums[i] > 0){
                    right--;
                } else if (nums[right] + nums[left] + nums[i] < 0) {
                    left++;
                }else {
                    result.add(Arrays.asList(nums[right], nums[left], nums[i]));
                    while (right > left && nums[right] == nums[right - 1]){
                        right--;
                    }
                    while (right > left && nums[left] == nums[left + 1]){
                        left++;
                    }
                    right--;
                    left++;
                }
            }
        }
        return result;
    }
}
