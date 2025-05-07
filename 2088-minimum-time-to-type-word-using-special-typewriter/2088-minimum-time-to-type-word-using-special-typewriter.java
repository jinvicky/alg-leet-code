class Solution {
    public int minTimeToType(String word) {
       int minCount = 0;
       char from = 'a';
       for(char c : word.toCharArray()) {
            char to = c;
            minCount += Math.min((to - from + 26) % 26, (from - to + 26) % 26);
            minCount++;
            from = c;
       }


       return minCount;
    }


}