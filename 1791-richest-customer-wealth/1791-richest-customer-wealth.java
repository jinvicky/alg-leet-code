class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxW = 0;

        for(int i = 0; i < accounts.length; i++) {
            int current = 0;
            for(int j = 0; j < accounts[0].length; j++) {
                current += accounts[i][j];
            }
            maxW = Math.max(maxW, current);
        }
        return maxW;
    }
}