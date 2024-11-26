class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (char ch : words[i].toCharArray()) {
                if (ch == x) {
                    if(answer.isEmpty()) {
                        answer.add(i);
                    } else if (answer.get(answer.size()-1) != i) {
                        answer.add(i);
                    }
                }
            }
        }
        return answer;
    }
}