package com.dsahub.basics.arrays;

import java.util.HashMap;
import java.util.Map;


/**
 Problem Statement:

 You are given an array of integers nums and a target integer target.
 Your task is to find two distinct indices in the array such that the numbers at those indices add up to the given target.

 Return the indices of the two numbers.
 You can return the answer in any order.

 You may assume that each input will have exactly one solution, and you cannot use the same element twice.
 */

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("["+result[0] +" "+ result[1]+"]");    }

}
