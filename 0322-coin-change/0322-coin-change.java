// class Solution {
//     public int coinChange(int[] coins, int amount) {
//        int[] minCoins = new int[amount+1];
//        Arrays.fill(minCoins, amount+1);
//        minCoins[0] = 0;

//        for(int i = 1; i<=amount; i++) {
//         for(int j =0; j < coins.length; j++) {
//             if(i-coins[j] >=0) {
//                 minCoins[i] = Math.min(minCoins[i], 1+minCoins[i-coins[j]]);
//             }
//         }
//        }

//        return minCoins[amount] != amount + 1 ? minCoins[amount] : -1;
//     }
// }

class Solution {
    public int coinChange(int[] coins, int amount) {
        int max=amount+1;
        int [] dp=new int[amount+1];
        Arrays.fill(dp,max);
        dp[0]=0;
        for(int coin:coins){
            for(int j=coin;j<=amount;j++){
                dp[j]=Math.min(dp[j],dp[j-coin]+1);
            }
        }
        return dp[amount]>amount ? -1:dp[amount];
    }
}