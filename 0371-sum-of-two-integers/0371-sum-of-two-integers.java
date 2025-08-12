class Solution {
    public int getSum(int a, int b) {
    while (b != 0) {
        // 1. 합(Sum): 올림수 없이 두 수를 더한 값
        int sum = a ^ b;
        
        // 2. 올림수(Carry): 올림수가 발생한 비트를 왼쪽으로 한 칸 시프트
        int carry = (a & b) << 1;
        
        // 3. 다음 반복을 위해 a에 합을, b에 올림수를 저장
        a = sum;
        b = carry;
    }
    // 올림수가 0이 되면 최종 합이 a에 남게 됨
    return a;
    }
}