package com.codinghub.leetcode.doublePointer;

/**
 * @author 莱特0905
 * @Description: 移动零
 * @Date: 2024/08/04 21:41:44
 */
public class leetcode283 {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0){
            return;
        }
        int left = 0, right = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            right++;
        }
    }
}
