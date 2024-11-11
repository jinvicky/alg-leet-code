class Solution {
   public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];

        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(i == 1) {
                    dp[i][j] = 1;
                    continue;
                }
                if (j== 1) {
                    dp[i][j] = 1;
                    continue;
                }

                int fromTop = dp[i-1][j];
                int fromLeft = dp[i][j-1];
                dp[i][j] = fromLeft + fromTop;
            }
        }
        return dp[m][n];
    }
}