class Solution {
    public int maxProfit(int[] prices) {
        int max = 0; 
        int minBuy = prices[0];
        for(int p : prices) {
            // 지금 파는 것이 최고 이익일까요?
            int currentMax = p - minBuy;

            max = Math.max(max, currentMax);
            minBuy = Math.min(minBuy, p); // 구매 주식 최소화
        }
        return max;
    }
}