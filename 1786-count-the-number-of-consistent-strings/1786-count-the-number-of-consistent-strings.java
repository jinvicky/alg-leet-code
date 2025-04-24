class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> st = new HashSet<>();
        int answer = 0;
        for (char c : allowed.toCharArray()) {
            st.add(c);
        }

        for (String word : words) {
            boolean pass = false;
            for (char c : word.toCharArray()) {
                if(!st.contains(c)) {
                    pass = false;
                    break;
                }
                pass = true;
            }

            if (pass) {
                System.out.println(word);
                answer++;
            }
        }

        return answer;
    }
}