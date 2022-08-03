package dataStructures.dynamicProgramming;

//https://leetcode.com/problems/min-cost-climbing-stairs/
public class MinCostClimbingStairs_746 {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] dp = new int[len+1];
        for(int i = 2; i < cost.length; i++){
            dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
        }
        dp[len] = Math.min(dp[len-1], dp[len-2]);
        return dp[len];
    }
}
