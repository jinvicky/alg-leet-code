class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] sToArr = s.toCharArray();
        char[] tToArr = t.toCharArray();
        int sp = 0;

        if(sToArr.length < 1) { // "" 일경우 항상 true
            return true;
        }

        for(int i = 0; i < tToArr.length; i++) {
            if(sp < sToArr.length && sToArr[sp] == tToArr[i]) {
                sp++;
            }
        }
        return sp < sToArr.length ? false : true;
    }
}