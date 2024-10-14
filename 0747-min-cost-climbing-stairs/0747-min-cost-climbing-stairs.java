class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];

        // if(cost.length == 1) {
        //     return cost[0]; // cost[0]일까 0일까?
        // }

        // if(cost.length == 2) {
        //     return Math.min(cost[0], cost[1]);
        // }

        dp[cost.length] = 0;
        dp[cost.length-1] = cost[cost.length-1];
        for(int i = cost.length - 2 ; i >= 0; i--) {
            dp[i] = cost[i] + Math.min(dp[i+1], dp[i+2]);
            System.out.println(dp[i]);
        }

        return Math.min(dp[0], dp[1]);
    }
}