package com.codinghub.leetcode.hash;

import java.util.*;

/**
 * @author 莱特0905
 * @Description: 字母异位词分组
 * @Date: 2024/07/29 18:58:50
 */
public class leetcode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 创建一个HashMap，用于存储排序后的字符串和其对应的字母异位词列表
        Map<String, List<String>> map = new HashMap<>();

        // 遍历输入的字符串数组
        for (String str : strs) {
            // 将字符串转换为字符数组
            char[] chars = str.toCharArray();
            // 对字符数组进行排序
            Arrays.sort(chars);
            // 将排序后的字符数组转换为字符串作为键
            String key = new String(chars);
            // 如果键已存在，获取其对应的列表；如果不存在，则创建一个新的列表
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            // 将原始字符串添加到列表中
            list.add(str);
            // 将键和值对放入Map中
            map.put(key, list);
        }

        // 返回字母异位词列表的集合
        return new ArrayList<>(map.values());
    }

}
