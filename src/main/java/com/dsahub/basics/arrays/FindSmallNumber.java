package com.dsahub.basics.arrays;

public class FindSmallNumber {
    public static void main(String[] args) {
        int [] array={110,3,4,7,8,9,6};
        int minValue=array[0];

        for (int i:array){
            if(i<minValue){
                minValue=i;
            }
        }
        System.out.println("The smallest number in the array is: "+minValue);
    }
}
