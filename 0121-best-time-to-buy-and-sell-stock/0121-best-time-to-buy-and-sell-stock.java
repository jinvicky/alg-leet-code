class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int max = 0;

        for (int i = 1; i < prices.length; i++) {
            max = Math.max(prices[i] - minBuy, max);
            if(prices[i] < minBuy) {
                minBuy = prices[i];
            }
        }
        return max;
    }
}