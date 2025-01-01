class Solution {
    public int countDigits(int num) {
        int answer = 0;
        if(num < 10) return 1;
        else {
            int origin = num;
            while (origin > 0) {
                int eachDigit = origin % 10;
                if(num % eachDigit == 0) {
                    answer++;
                }
                origin /= 10;
            }
        }
        return answer;
    }
}