class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        int max = 0;

        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        } else {
            dp[0] = nums[0];
            dp[1] = nums[1];

            for (int i = 2; i < nums.length; i++) {
                if (i - 3 < 0) {
                    // 그냥 dp[i-2]와 nums[i]가 dp[i]에 들어간다.
                    dp[i] = dp[i - 2] + nums[i];
                } else {
                    int bigger = Math.max(dp[i - 2], dp[i - 3]);
                    dp[i] = bigger + nums[i];
                }
            }

            for (int i = 0; i < dp.length; i++) {
                max = Math.max(max, dp[i]);
            }
        }
        return max;
    }
}