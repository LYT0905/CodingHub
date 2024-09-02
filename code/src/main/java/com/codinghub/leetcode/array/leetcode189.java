package com.codinghub.leetcode.array;

/**
 * @author 莱特0905
 * @Description: 轮转数组
 * @Date: 2024/09/02 20:53:21
 */
public class leetcode189 {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0){
            return;
        }
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int left, int right){
        while (left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
