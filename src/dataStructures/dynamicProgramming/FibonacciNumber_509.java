package dataStructures.dynamicProgramming;

import java.util.Arrays;

//https://leetcode.com/problems/fibonacci-number/

public class FibonacciNumber_509 {

//    ------------accumulate sum(the fastest)
    public int fib(int n) {
        if(n < 2){
            return n;
        }

        int tmp = 0, fa = 0, fb = 1;
        for(int i = 2; i <= n; i++){
            tmp = fa + fb;
            fa = fb;
            fb = tmp;
        }
        return tmp;

    }


//    ------------array: keep record of each nums[n]
    public int fib2(int n) {
        if(n < 2){
            return n;
        }
         int[] nums = new int[n+1];
         Arrays.fill(nums, 0);

         nums[1] = 1;
         for(int i = 2; i <= n; i++){
             nums[i]= nums[i-1] + nums[i-2];
         }
         return nums[n];
    }


//    -------------recursive
    public int fib3(int n) {

         return fun(n);
    }

     public int fun(int n){
         if(n < 2){
             return n;
         }
         return fun(n-1) + fun(n-2);
     }
}
