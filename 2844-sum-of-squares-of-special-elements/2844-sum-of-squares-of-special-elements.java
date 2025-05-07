class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int total = 0;
        for(int i = 0; i < nums.length; i++) {
            if((n %( i + 1)) == 0) {
                // 스페셜 넘버
                total += nums[i]  * nums[i];
            }
        }

        return total;
    }
}