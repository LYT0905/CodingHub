package com.codinghub.leetcode.doublePointer;

/**
 * @author 莱特0905
 * @Description: 盛最多水的容器
 * @Date: 2024/08/04 21:53:47
 */
public class leetcode11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int result = 0;
        while (left < right){
            if (height[left] < height[right]){
                result = Math.max(result, (right - left) * height[left]);
                left++;
            }else {
                result = Math.max(result, (right - left) * height[right]);
                right--;
            }
        }
        return result;
    }
}
