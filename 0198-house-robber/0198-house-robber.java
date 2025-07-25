class Solution {
    public int rob(int[] nums) {
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];

        for(int i = 1; i < nums.length; i++) {
            int prev2AndNowRob = (i - 2 < 0 ? 0 : dp[i - 2]) + nums[i];
            int prev1Rob = dp[i-1];

            dp[i] = Math.max(prev2AndNowRob, prev1Rob);
        }

        return dp[nums.length-1];
    }
}