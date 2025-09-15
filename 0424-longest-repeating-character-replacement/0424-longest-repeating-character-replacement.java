class Solution {
    public int characterReplacement(String s, int k) {

        Map<Character, Integer> charCount = new HashMap<>();

        int left = 0;
        int maxFrequency = 0;
        int maxLength = 0;

        for(int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);

            charCount.put(rightChar, charCount.getOrDefault(rightChar, 0) + 1);
            
            maxFrequency = Math.max(maxFrequency, charCount.get(rightChar));
            
            if((right - left + 1) - maxFrequency > k) {
                char leftChar = s.charAt(left);
                
                charCount.put(leftChar, charCount.get(leftChar) - 1);
                left++;
            }
            
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}