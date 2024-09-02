package com.codinghub.leetcode.subString;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author 莱特0905
 * @Description: 滑动窗口最大值
 * @Date: 2024/08/18 20:40:51
 */
public class leetcode239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0){
            return new int[]{0};
        }
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1){
                deque.pollFirst();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]){
                deque.pollLast();
            }
            deque.offerLast(i);
            if (i >= k - 1){
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return result;
    }
}
