package com.codinghub.leetcode.doublePointer;

import java.util.Stack;
import java.util.*;

/**
 * @author 莱特0905
 * @Description: 接雨水
 * @Date: 2024/08/10 21:42:43
 */
public class leetcode42 {
    public int trap(int[] height) {
        int result = 0;
        if (height == null || height.length == 0){
            return result;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i < height.length; i++){
            if (height[i] < height[stack.peek()]){
                stack.push(i);
            } else if (height[i] == height[stack.peek()]) {
                stack.pop();
                stack.push(i);
            }else {
                while (!stack.isEmpty() && height[i] > height[stack.peek()]){
                    Integer midIndex = stack.pop();
                    int mid = height[midIndex];
                    if (!stack.isEmpty()){
                        Integer leftIndex = stack.peek();
                        int left = height[leftIndex];
                        int right = height[i];
                        int width = i - leftIndex - 1;
                        int high = Math.min(left, right) - mid;
                        result += width * high;
                    }
                }
                stack.push(i);
            }
        }
        return result;
    }
}
