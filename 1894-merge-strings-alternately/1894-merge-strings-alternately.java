class Solution {
    public String mergeAlternately(String word1, String word2) {
        int min = Math.min(word1.length(), word2.length());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < min; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        if (word1.length() == min) { // word1이 더 짦음
            sb.append(word2.substring(min, word2.length()));
        } else {
            sb.append(word1.substring(min, word1.length()));
        }

        return sb.toString();
    }
}