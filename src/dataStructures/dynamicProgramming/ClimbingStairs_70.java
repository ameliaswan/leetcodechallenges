package dataStructures.dynamicProgramming;


//https://leetcode.com/problems/climbing-stairs/

public class ClimbingStairs_70 {

//    ----------the same as FibonacciNumber, but f(0) = 1, f(1) = 1;
    public int climbStairs(int n) {
        if(n < 2){
            return n;
        }

        int tmp = 0, fa = 1, fb = 1;
        for(int i = 2; i <= n; i++){
            tmp = fa + fb;
            fa = fb;
            fb = tmp;
        }
        return tmp;
    }
}
