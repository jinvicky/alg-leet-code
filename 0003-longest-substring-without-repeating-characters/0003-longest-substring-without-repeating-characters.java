class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;

        Map<Character, Integer> last = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if (last.containsKey(ch)) {
                // 중복을 발견했을 때, 창 시작을 해당 문자의 '이전 위치 + 1'로 당기되
                // 이미 더 오른쪽이면 그대로 유지
                left = Math.max(left, last.get(ch) + 1);
            }

            maxLen = Math.max(maxLen, right - left + 1);
            last.put(ch, right); // 방금 문자의 '마지막 위치' 갱신
        }
        return maxLen;
    }
}
