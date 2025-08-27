class Solution {
    public String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            String odd  = expand(s, i, i);       // 홀수 중심
            String even = expand(s, i, i + 1);   // 짝수 중심  ← (i, i+1)

            String better = odd.length() >= even.length() ? odd : even;
            if (better.length() > answer.length()) {
                answer = better;                 // 최장 갱신
            }
        }
        return answer;
    }

    private String expand(String s, int L, int R) {
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return s.substring(L+1, R);
    }
}