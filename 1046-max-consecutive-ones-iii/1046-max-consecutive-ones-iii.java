class Solution {
    public int longestOnes(int[] nums, int k) {
        int result = 0;
        int left = 0;
        int zeroes = 0;
        
        for(int i = 0; i < nums.length; i++) { // i == right
            if(nums[i] == 0) {
                zeroes++;
                while(zeroes > k) {
                    int val = nums[left++];
                    if(val == 0) zeroes--;
                }
            }
            result = Math.max(result, i - left + 1);
        }
        return result;
    }
}