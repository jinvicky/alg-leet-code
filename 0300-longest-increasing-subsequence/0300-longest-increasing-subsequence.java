class Solution {
    public int lengthOfLIS(int[] nums) {
        // null이거나 길이가 0일 때 사전 브레이크 
        if (nums == null || nums.length == 0)
            return 0;

        int answer = 0;
        int[] dp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if(nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j]+ 1);
                }
            }
            // 5. 전체 LIS 길이 갱신
            answer = Math.max(answer, dp[i]);
        }
        return answer;
    }
}