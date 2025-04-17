class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int n = words.length; 

        if(n==1) return List.of(words[0]);
        int grpId = -1;

        List<String> answer = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(grpId != groups[i]) {
                answer.add(words[i]);
                grpId = groups[i];
            }
        }
        
        return answer;
    }
}