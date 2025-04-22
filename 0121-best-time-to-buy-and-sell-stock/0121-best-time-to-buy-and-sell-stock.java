class Solution {
    public int maxProfit(int[] prices) {
        int answer = 0;
        int myStock = prices[0];

        for(int i = 1; i < prices.length ;i++) {
            if(myStock > prices[i]) { // 내 스톡이 더 크다.
                myStock = prices[i]; // 더 작은 값으로 내 주식을 갱신
            } else {
                answer = Math.max(answer, Math.abs(myStock - prices[i]));
            }
        }
        return answer;
    }
}