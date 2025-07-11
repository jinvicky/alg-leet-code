class Solution {
    public int climbStairs(int n) {
        if (n <= 3) return n;
        int[] pibo = new int[n];

        pibo[0]=1;
        pibo[1]=2;
        pibo[2]=3;

        for(int i = 3; i < n; i++) {
            pibo[i] = pibo[i-1] + pibo[i-2];
        }

        return pibo[n-1];
    }
}