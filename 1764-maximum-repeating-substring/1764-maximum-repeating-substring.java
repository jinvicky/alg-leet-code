class Solution {
    public int maxRepeating(String sequence, String word) {
        if(sequence.indexOf(word) == -1) return 0;
        int answer = 0;
        String repeat = word;
       
        // 연속적으로 최대 몇번이냐 ~
        while(sequence.contains(repeat)) {
            answer++;
            repeat+=word;
        }
        return answer;
    }
}