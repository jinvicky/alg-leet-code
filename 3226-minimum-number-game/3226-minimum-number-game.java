class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);

        for(int i = 0; i < nums.length-1; i+=2) {
            // i와 i+1을 swap한다.
            int tmp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = tmp;
        }

        return nums;
    }
}