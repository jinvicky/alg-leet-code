class Solution {
    public boolean detectCapitalUse(String word) {
        int capCount = 0;

        for(char c : word.toCharArray()) {
            boolean isCapital = c - 'A' <= 26;
            if(isCapital) capCount++;
        }
        return capCount == word.length() || capCount == 0 || capCount == 1 && word.charAt(0) - 'A' <= 26;
    }
}