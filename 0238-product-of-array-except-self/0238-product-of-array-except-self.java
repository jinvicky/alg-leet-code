class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int sum = 1; // zero 값 제외
        int zeroCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                sum *= nums[i];
            }
        }

        if (zeroCount == 1) {
            for (int i = 0; i < nums.length; i++) {
                answer[i] = nums[i] == 0 ? sum : 0;
            }
        } else if (zeroCount >= 2) {
            for (int i = 0; i < nums.length; i++) {
                answer[i] = 0;
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                answer[i] = sum / (nums[i]);
            }
        }
        return answer;
    }
}