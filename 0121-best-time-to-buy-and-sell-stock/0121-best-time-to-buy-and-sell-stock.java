class Solution {
    public int maxProfit(int[] prices) {
        /**
            얻을 수 있는 최대 이익의 값(요소 정보 없어도 됨)
        
         */
        int minBuy = prices[0];
        int[] max = new int[prices.length];

        for (int i = 1; i < prices.length; i++) {
            max[i] = Math.max(prices[i] - minBuy, max[i-1]);

            // 다음 연산에 사용할 buy 기준값을 갱신.
            minBuy = Math.min(prices[i], minBuy);

            System.out.println(max[i]);
        }

        return max[prices.length-1];
    }
}