class Solution {
    public int minDistance(String word1, String word2) {
        int maxCommonLength = minDistance2(word1, word2);
        return word1.length() + word2.length() - maxCommonLength - maxCommonLength;
    }

    public int minDistance2(String word1, String word2) {
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];
        char[] str1 = word1.toCharArray();
        char[] str2 = word2.toCharArray();

        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {
                if (str1[i - 1] == str2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
}