class Solution {
    public int maxProfit(int[] prices) {
        int[] dp = new int[prices.length];
        int buyPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - buyPrice;
            dp[i] = Math.max(dp[i - 1], profit);
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            }
        }

        return dp[prices.length - 1];
    }
}