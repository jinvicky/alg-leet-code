class Solution {
    public int[] runningSum(int[] nums) {
        int[] results = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            if(i - 1 < 0) {
                results[i] = nums[i];
            } else {
                results[i] = results[i-1] + nums[i];
            }
        }
        return results;
    }
}