class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] sums = new int[accounts.length];

        System.out.println("length:" + sums.length);
        for (int i = 0; i < sums.length; i++) {
            int[] account = accounts[i];
            int accountSum = 0;

            for(int j = 0; j < account.length; j++) {
                accountSum += account[j];
            }
            sums[i] = accountSum;
        }

        int max = 0;
        for(int k = 0; k < sums.length; k++) {
            max = Math.max(max, sums[k]);
        }
        
        return max;
    }
}