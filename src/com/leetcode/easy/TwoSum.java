package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.logging.Logger;

/*Two Sum
Description
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

Tags: Array, Hash Table
*/
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};

        int[] ints = twoSum(nums, 9);

        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            var valor = map.get(nums[i]);
            if(valor != null){
                return new int[] {valor,i};
            }
            map.put(target-nums[i], i);
        }
        return new int[]{};
    }
}
