class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] account: accounts) {
            int tempMax = 0;
            for(int a : account) {
                tempMax += a;
            }
            max = Math.max(max, tempMax);
        }
        return max;
    }
}