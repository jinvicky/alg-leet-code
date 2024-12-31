class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;

        for(int n : nums) {
            elementSum+=n; // 요소합은 그냥 더한다.
            if(n < 10) { // 1자릿수입니다. 자릿수합은 추가 연산
                digitSum+=n;
            } else {
                while(n > 0) {
                    digitSum+= n % 10;
                    n/=10;
                }
            }
        }
        return Math.abs(elementSum - digitSum);
    }
}