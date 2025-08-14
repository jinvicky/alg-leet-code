class Solution {
    public boolean divisorGame(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2)
            return true;
        if (n == 3)
            return false;

        boolean[] dp = new boolean[n+1];

        dp[1] = false;
        dp[2] = true;
        dp[3] = false;

        for(int i = 4; i <= n; i++) {
            dp[i] = !dp[i-1];
        }
        return dp[n];
    }
}