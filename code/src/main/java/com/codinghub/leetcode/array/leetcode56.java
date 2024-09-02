package com.codinghub.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author 莱特0905
 * @Description: 合并区间
 * @Date: 2024/08/29 17:04:44
 */
public class leetcode56 {
    public static int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        if (intervals == null || intervals.length == 0){
            return new int[][]{};
        }
        Arrays.sort(intervals, (x, y) -> x[0] - y[0]);
        int start = intervals[0][0];
        int rightMostRightBound = intervals[0][1];
        for (int i = 1; i < intervals.length; i++){
            if (intervals[i][0] < rightMostRightBound){
                rightMostRightBound = Math.max(rightMostRightBound, intervals[i][1]);
            }else {
                result.add(new int[]{start, rightMostRightBound});
                start = intervals[i][0];
                rightMostRightBound = intervals[i][1];
            }
        }
        result.add(new int[]{start, rightMostRightBound});
        return result.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] ints = new int[][]{{1,3}, {2,6}, {8,10}, {15,18}};

        merge(ints);
    }
}
