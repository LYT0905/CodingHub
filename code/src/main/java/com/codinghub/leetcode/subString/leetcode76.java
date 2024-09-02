package com.codinghub.leetcode.subString;

/**
 * @author 莱特0905
 * @Description: 最小覆盖子串
 * @Date: 2024/08/22 19:44:51
 */
public class leetcode76 {
    public String minWindow(String s, String t) {
        char[] sChar = s.toCharArray();
        int resultLeft = -1;
        int m = s.length();
        int resultRight = m;
        int left = 0;
        int[] cntS = new int[128];
        int[] cntT = new int[128];
        for (char c : t.toCharArray()) {
            cntT[c]++;
        }
        for (int right = 0; right < m; right++) {
            cntS[sChar[right]]++;
            while (isCovered(cntS, cntT)){
                if (right - left < resultRight - resultLeft){
                    resultRight = right;
                    resultLeft = left;
                }
                cntS[sChar[left++]]--;
            }
        }
        return resultLeft < 0 ? "" : s.substring(resultLeft, resultRight + 1);
    }

    private boolean isCovered(int[] cntS, int[] cntT){
        for (int i = 'a'; i <= 'z'; i++){
            if (cntS[i] < cntT[i]){
                return false;
            }
        }
        for (int i = 'A'; i <= 'Z'; i++){
            if (cntS[i] < cntT[i]){
                return false;
            }
        }
        return true;
    }
}
