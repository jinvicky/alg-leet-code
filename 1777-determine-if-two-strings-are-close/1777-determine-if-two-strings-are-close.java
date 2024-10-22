class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] f1 = new int[26];
        int[] f2 = new int[26];

        for(char c: word1.toCharArray()) {
            f1[c-'a']++;
        }

        for(char c: word2.toCharArray()) {
            if(f1[c-'a']== 0) {
                return false;
            }
            f2[c-'a']++;
        }

        Arrays.sort(f1);
        Arrays.sort(f2);
        return Arrays.equals(f1, f2);
    }
}