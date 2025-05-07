class Solution {
    public int pivotIndex(int[] nums) {
        int total   = 0;
        int leftSum = 0;
        for(int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        for(int i = 0; i < nums.length; i++) {
            int right = total - leftSum - nums[i];

            if(leftSum == right) return i;
            leftSum += nums[i];
        }

        return -1;
    }
}