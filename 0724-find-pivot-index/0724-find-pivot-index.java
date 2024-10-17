class Solution {
    public int pivotIndex(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];

        int lSum = 0;
        for(int i =0; i < nums.length; i++) {
            lSum += nums[i];
            leftSum[i] = lSum;
        }

        int rSum = 0;
        for(int i = nums.length - 1; i >= 0 ; i--) {
            rSum += nums[i];
            rightSum[i] = rSum;
        }


        for(int i = 0; i < nums.length; i++) {
            if(leftSum[i] == rightSum[i]) {
                return i;
            }
        }
        return -1;
    }
}