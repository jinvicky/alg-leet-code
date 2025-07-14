class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int[] max = new int[prices.length];

        for (int i = 1; i < prices.length; i++) {
            max[i] = Math.max(prices[i] - minBuy, max[i-1]);
            minBuy = Math.min(prices[i], minBuy);
        }

        return max[prices.length-1];
    }
}