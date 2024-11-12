class Solution {
     public boolean isSubsequence(String s, String t) {
        if(s.equals(t)) {
            return true;
        } else if (s.length() > t.length()) {
            return false;
        }
        
        int pointer = 0;
        int range = s.length();

        for(int i = 0; i < t.length(); i++) {
            if(pointer >= range) {
                return true;
            }
            if(s.charAt(pointer) == t.charAt(i)) {
                pointer++;
            }
        }
        return pointer >= range;
    }
}