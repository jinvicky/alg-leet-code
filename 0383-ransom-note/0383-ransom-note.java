class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        int[] mCount = new int[26];
        int[] rCount = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            char mc = magazine.charAt(i);
            mCount[mc - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char rc = ransomNote.charAt(i);
            rCount[rc - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (mCount[i] < rCount[i])
                return false;
        }

        return true;
    }
}