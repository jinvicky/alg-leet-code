class Solution {
    public int sumOfMultiples(int n) {
        int[] kases = new int[] { 3, 5, 7 };
        int result = 0;

        for (int i = 1; i <= n; i++) {
            for (int k : kases) {
                if(i%k == 0) {
                    result+=i;
                    break;
                }
            }
        }
        return result;
    }
}