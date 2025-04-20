package com.dsahub.basics.fibonacci;

public class RecursionFibonacci {

    public static int count=2;

    public static void fibonacci(int pre1,int prev2){
        if(count<=10){
            int newFibo=prev2+pre1;
            System.out.println(newFibo);
            prev2=pre1;
            pre1=newFibo;
            count+=1;
            fibonacci(pre1,prev2);
        }else {
            return;
        }
    }

    public static void main(String[] args) {
        int prev2=0;
        int prev1=1;

        System.out.println(prev2);
        System.out.println(prev1);

        fibonacci(prev1,prev2);
    }
}
