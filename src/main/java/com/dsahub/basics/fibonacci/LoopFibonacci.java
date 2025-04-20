package com.dsahub.basics.fibonacci;

public class LoopFibonacci {

    public static void main(String[] args) {
        int prev2=0;
        int prev1=1;

        System.out.println(prev2);
        System.out.println(prev1);
        
        for(int fibo=0; fibo<20; fibo++){
            int newFibo=prev2+prev1;
            System.out.println(newFibo);
            prev2=prev1;
            prev1=newFibo;
        }
    }
}
