class Solution {
    public int countGoodSubstrings(String s) {
        // map으로 짠다음에 ch 중복이 없으면 map의 val을 더하자. 
        int offset = 3;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + offset > s.length())
                break;
            String str = s.substring(i, i + offset);

            if (str.charAt(0) != str.charAt(1) && str.charAt(1) != str.charAt(2) && str.charAt(0) != str.charAt(2)) {
                max ++;
            }
        }
        return max;
    }
}