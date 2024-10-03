class Solution {
    public int removeDuplicates(int[] nums) {
        int insertIdx = 0;

        for(int i = 0; i < nums.length; i++) {
            if(i == 0 || nums[i] != nums[i-1]) {
                nums[insertIdx] = nums[i];
                insertIdx++;
            }
        }
        return nums.length - (nums.length - insertIdx);
    }
}