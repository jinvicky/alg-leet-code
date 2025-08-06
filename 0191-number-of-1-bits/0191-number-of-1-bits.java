class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            count += (n & 1); // 마지막 비트 확인
            n >>>= 1; // 부호 없는 우측 시프트
        }
        return count;
    }
}