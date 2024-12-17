class Solution {
   public int countKeyChanges(String s) {
        int shift = 0;
        char prev = s.charAt(0);

        for (char c : s.toCharArray()) {
            if (!isSame(prev, c)) {
                shift++;
            }
            prev = c;
        }

        return shift;
    }

    private boolean isSame(char prev, char current) {
        if (prev == current) { // 둘다 대문자이거나 둘다 소문자인 경우
            return true;
        }
        // 한쪽은 소문자, 다른 한쪽은 대문자인 경우
        return prev - 'a' == current - 'A' || prev - 'A' == current - 'a';
    }
}