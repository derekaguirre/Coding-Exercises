package Completed.DynamicProgramming;

//Submission: https://leetcode.com/problems/guess-number-higher-or-lower-ii/submissions/1089992326/

public class GuessGameII {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 2][n + 1];
        
        for(int len = 2; len <= n; ++len){
            for(int start = 1; start <= n - len+1; ++start){
                int end = start + len - 1;
                
                int curMin = Integer.MAX_VALUE;
                for(int pivot = start; pivot <= end; ++pivot){
                    curMin = Math.min(curMin, pivot + Math.max(dp[start][pivot-1], dp[pivot + 1][end]));
                }
                dp[start][end] = curMin;
            }
        }
        return dp[1][n];
    }
}
