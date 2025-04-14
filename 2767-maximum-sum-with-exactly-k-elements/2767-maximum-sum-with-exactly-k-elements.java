class Solution {
    public int maximizeSum(int[] nums, int k) {

        Arrays.sort(nums);
        int sum = 0;
        int end = nums[nums.length -1];
        for(int i = 1; i <= k; i++) {
            sum += end++;
        }
        
        return sum;
    }
}