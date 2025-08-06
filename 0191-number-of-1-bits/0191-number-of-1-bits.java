class Solution {
    public int hammingWeight(int n) {
        int answer = 0;
        for(int i = 0; i < 32; i++) {
            if(((n>>i) & 1) == 1) {
                answer+=1;
            }
        }
        return answer;
    }
}