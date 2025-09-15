class Solution {
    // public int countSubstrings(String s) {
    //     int n = s.length();
    //     int count = 0;
    //     for (int c = 0; c < n; c++) {
    //         count += expand(s, c, c);     // 홀수 길이 중심
    //         count += expand(s, c, c + 1); // 짝수 길이 중심
    //     }
    //     return count;
    // }

    // private int expand(String s, int L, int R) {
    //     int add = 0;
    //     while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
    //         add++; L--; R++;
    //     }
    //     return add;
    // }
        public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;

        for (int center = 0; center < 2 * n - 1; center++) {
            int left = center / 2;
            int right = left + center % 2;

            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }

        return count;
    }
   
}
