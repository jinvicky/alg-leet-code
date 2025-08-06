class Solution {
    public int hammingWeight(int n) {
        // return Integer.bitCount(n);

        int count = 0;
        while (n != 0) {
            n &= (n - 1); // 가장 오른쪽 1 비트를 0으로 만듦
            count++;
        }
        return count;
    }
}