class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        int[] dp = new int[pairs.length];
        int answer = 0;

        for (int i = 0; i < pairs.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                int e = pairs[j][1];

                if (pairs[i][0] > e) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            answer = Math.max(dp[i], answer);
        }
        return answer;
    }
}