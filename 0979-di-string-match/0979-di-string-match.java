class Solution {
    public int[] diStringMatch(String s) {
        int[] res = new int[s.length() +1];
        int left = 0;
        int right = s.length();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            res[i] = ch == 'I' ? left++ : right--;
        }

        res[s.length()] = left;

        return res;
    }
}