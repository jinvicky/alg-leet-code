class Solution {
      public int longestPalindrome(String s) {
        //일단 길이가 1이고 공백이 아니면
        if(s.length() == 1 && !s.equals(" ")) {
            return 1;
        }

        Map<Character, Integer> freqMap = new HashMap<>();

        for(char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) +1);
        }

        int oddCount = 0;
        int answer = s.length();
        for(Map.Entry<Character, Integer> pair : freqMap.entrySet()) {
            if(pair.getValue() % 2 != 0) {
                if(oddCount == 0) {
                    oddCount++;
                } else {
                    answer--;
                }
            }
        }
        return answer;
    }
}