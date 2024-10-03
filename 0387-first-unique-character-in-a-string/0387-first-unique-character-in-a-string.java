class Solution {
    public int firstUniqChar(String s) {
       int[] freq = new int[26];
       char[] chars = s.toCharArray();
       for(char c : chars) {
        freq[c-'a']++;
       }

       for(int i = 0; i < chars.length; i++) {
            if(freq[chars[i] - 'a'] == 1) {
                return i; // 어차피 위에서 이미 빈도수를 구했기 때문에 바로 리턴하면 더 효율적이다.
            }
       }
       return -1;
    }
}