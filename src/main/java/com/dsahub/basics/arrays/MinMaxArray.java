package com.dsahub.basics.arrays;

/**
 * Problem Statement:
 *
 * You are given an array of integers and you need to find the minimum and maximum values in the array.
 */

public class MinMaxArray {
    public static void main(String[] args) {
        int[] array = {110, 3, 4, 7, 8, 9, 6};
        int minValue = array[0];
        int maxValue = array[0];

        for (int i : array) {
            if (i < minValue) {
                minValue = i;
            }
            if (i > maxValue) {
                maxValue = i;
            }
        }
        System.out.println("The smallest number in the array is: " + minValue);
        System.out.println("The largest number in the array is: " + maxValue);
    }
}
