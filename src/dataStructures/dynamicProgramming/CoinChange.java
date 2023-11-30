package dataStructures.dynamicProgramming;

import java.util.Arrays;

//@author Kooni Wang 1322454
public class CoinChange {
    public int coinSelection(int[] coins, int sum, int idx){
        if(sum == 0) return 1;
        if(sum < 0 || idx > coins.length - 1) return 0;
        return coinSelection(coins, sum - coins[idx], idx) + coinSelection(coins, sum, ++idx);
    }

    public int coinSelectionWithMemo(int[] coins, int sum){
        int[][] dp = new int[coins.length+1][sum+1];
        for(int m = 0; m < dp.length; m++){
            dp[m][0] = 1;
        }
        Arrays.fill(dp[0], 0);

        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                dp[i][j] = dp[i-1][j] + (j-coins[i-1] < 0 ? 0 : dp[i][j-coins[i-1]]);
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    public static void main(String[] args){
//        int[] coins = {2,5,3,6};
//        int sum = 10;
        int[] coins = {1,2,3};
        int sum = 4;

        CoinChange var = new CoinChange();
        int result = var.coinSelection(coins, sum, 0);
        System.out.println("Kooni Wang 1322454");
        System.out.println("Number of Solutions: " + result);

        int resultM = var.coinSelectionWithMemo(coins, sum);
        System.out.println("Number of Solutions: " + resultM);
    }
}
