class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals("")) return true;
        int order = 0;
        for(int i = 0; i < t.length(); i++) {
            if (order == s.length()) return true;
            if(t.charAt(i) == s.charAt(order)) {
                order++;
            }
        }
        return order == s.length();
    }
}