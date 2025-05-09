class Solution {
    public int balancedStringSplit(String s) {
        int max = 0;
        int count = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'L') {
                max++;
            } else {
                max--;
            }
            if (max == 0)
                count++;
        }
        return count;
    }
}