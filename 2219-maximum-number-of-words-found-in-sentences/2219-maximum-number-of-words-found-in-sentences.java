class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxLength = 0;
        for(String s : sentences) {
            String[] array = s.split(" ");
            maxLength = Math.max(maxLength, array.length);
        }
        return maxLength;
    }
}