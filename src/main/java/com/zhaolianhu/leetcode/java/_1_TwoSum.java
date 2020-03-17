package com.zhaolianhu.leetcode.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Title: _1_TwoSum
 * @Package: com.zhaolianhu.leetcode
 * @Author: 赵脸乎 zhaolianhu
 * @date: 2020/3/16
 * @Version: V1.0
 * @Youtube: https://www.youtube.com/channel/UC-jVOzJUI1b8g55GgVWxa8A
 * @Bilibili: https://space.bilibili.com/477506440
 */
public class _1_TwoSum {

    /**
     * @Description: <p>
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * <p>
     * 给定一个整数数组，返回两个数字的索引，使它们加起来等于一个特定的目标值。
     * 你可以假设每次输入将只有一个返回结果，并且不能两次使用相同的元素。
     * <p>
     * Example:
     * <p>
     * Given nums = [2, 7, 11, 15], target = 9,
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     * @Param: [nums, target]
     * @Return: int[]
     */
    public static int[] twoSum(int[] nums, int target) {

        // key 差值, value 数组下标
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            System.out.println("temp: " + temp + " target: " + target + " nums[i]: " + nums[i]);

            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            } else {
                map.put(temp, i);
            }

            System.out.println("map: " + map);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 18;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));


    }


}
