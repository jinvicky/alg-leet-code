class Solution {
    public String firstPalindrome(String[] words) {
        for (String w : words) {
            StringBuffer sb = new StringBuffer(w);
            String reversedStr = sb.reverse().toString();

            if(reversedStr.equals(w)) {
                return w;
            }
        }
        return "";
    }
}