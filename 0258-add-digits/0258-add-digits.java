class Solution {

    private int recursive(int n) {
        int ans = 0;
        while(n > 0) {
            ans += n % 10;
            n /= 10;
        }
        return ans;
    }
    public int addDigits(int num) {
        if(num < 10) {
            return num;
        }

        int beat = num;
        while(beat >= 10) {
            beat = recursive(beat);
        }
        return beat;
    }
}