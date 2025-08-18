class Solution {
    public int maxProfit(int[] prices) {
        int max = 0; // dp var
        int min = prices[0];
        /**
            max라는 메모이제이션 변수를 int로 선언한다.
            dp로 모든 경우의 수를 고려할 것이다. 
            주식의 최소가격을 담은 변수를 int로 선언한다. 맨 처음에 prices[0] 값이 되면 좋겠다.
         */
        for(int i = 1; i < prices.length; i++) {
            /**
                현재 주식은 팔 때의 주식 가격을 나타낸다. 
                max에는 현재 주식 가격 - 현재 최소 주식 가격의 값을 저장한다. (abs 금지)
                현재 주식값이 기존 최소 주식값보다 작다면 현재 주식값으로 최솟값을 업데이트한다.
             */
            int currentMax = prices[i] - min;
            max = Math.max(max, currentMax);
            if(prices[i] < min) {
                min = prices[i];
            }
        }

        return max;
    }
}