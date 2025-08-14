class Solution {
    public int maxProfit(int[] prices) {
        int biggest = 0;
        int buyPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - buyPrice;
            biggest = Math.max(biggest, profit);
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            }
        }

        return biggest;
    }
}