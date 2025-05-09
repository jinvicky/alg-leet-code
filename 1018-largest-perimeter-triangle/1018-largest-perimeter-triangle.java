class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int answer = 0;

        for (int k = nums.length - 1; k >= 0; k--) {
            int biggest = nums[k];
            for (int i = k - 1; i > 0; i--) {
                int sum = nums[i] + nums[i - 1];
                if (sum > biggest) {
                    answer = Math.max(answer, sum + biggest);
                }
            }
        }
        return answer;
    }
}