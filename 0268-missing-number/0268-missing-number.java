class Solution {
    public int missingNumber(int[] nums) {
        int expected = 0; // 0부터 n까지 더한 숫자의 합계
        int input = 0; //nums가 준 숫자들의 합계

        for (int n : nums) {
            input += n;
        }

        for (int i = 0; i <= nums.length; i++) {
            expected += i;
        }
        System.out.println(expected + " and " + input);

        return expected - input;
    }
}