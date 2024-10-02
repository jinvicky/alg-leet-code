class Solution {
    public void moveZeroes(int[] nums) {
        int zeroPosition = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[zeroPosition] = nums[i];
                zeroPosition++;
            }
        }

        for(int j = zeroPosition; j < nums.length; j++) {
            nums[j] = 0;
        }

    }
}