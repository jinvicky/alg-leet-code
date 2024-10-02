class Solution {
    public int charToNumber(char c) {
        return c - 'a'; // 'a'는 0, 'b'는 1, ..., 'z'는 25
    }   

    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }
        int[] sAlphas = new int[26];
        int[] tAlphas = new int[26];

        // 각 문자열의 문자를 카운트
        for (int i = 0; i < s.length(); i++) {
            sAlphas[charToNumber(s.charAt(i))]++;
        }

        for (int i = 0; i < t.length(); i++) {
            tAlphas[charToNumber(t.charAt(i))]++;
        }

        // 두 배열 비교
        for (int j = 0; j < 26; j++) {
            if (sAlphas[j] != tAlphas[j]) {
                return false; // 개수가 다르면 애너그램이 아님
            }
        }

        return true; // 모든 문자의 개수가 같으면 애너그램
    }
}
