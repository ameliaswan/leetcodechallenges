package dataStructures.dynamicProgramming;

public class MinimumFallingPathSum_931 {
    public int minFallingPathSum(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        if(r == 1 && c == 1) return matrix[0][0];
        int[][] dp = new int[r][c];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(i == 0) dp[0][j] = matrix[0][j];
                else{
                    if(j == 0) dp[i][j] = Math.min(dp[i-1][j], dp[i-1][j+1]);
                    else if (j == c-1) dp[i][j] = Math.min(dp[i-1][j-1], dp[i-1][j]);
                    else dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i-1][j+1]));
                    dp[i][j] += matrix[i][j];
                    if(i == r-1) min = Math.min(dp[i][j], min);
                }

            }
        }
        return min;
    }
}
