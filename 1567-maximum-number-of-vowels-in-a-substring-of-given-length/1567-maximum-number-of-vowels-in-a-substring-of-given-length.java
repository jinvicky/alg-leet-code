class Solution {
    public int maxVowels(String s, int k) {
        Queue<Character> queue = new LinkedList<>();
        int maxCount = 0;

        for(int i = 0; i < k; i++) {
            if(isVowel(s.charAt(i))) {
                maxCount++;
            }
            queue.add(s.charAt(i));
        } // ok

        int calCount = maxCount;
        for(int i = k; i < s.length(); i++) {
            if(!queue.isEmpty() && isVowel(queue.poll())) {
                calCount--;
            }
            if(isVowel(s.charAt(i))) {
                calCount++;
            }

            queue.add(s.charAt(i));
            maxCount = Math.max(calCount, maxCount);
        }

        return maxCount;
    }


    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}