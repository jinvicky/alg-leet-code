class Solution {
      public boolean checkIfPangram(String sentence) {
        int[] frequency = new int[26];

        for(char c : sentence.toCharArray()) {
            System.out.println(c-'a');
            frequency[c - 'a']++;
        }

        for(int i = 0; i < frequency.length; i++) {
            if(frequency[i] < 1) {
                return false;
            }
        }
        return true;
    }
}