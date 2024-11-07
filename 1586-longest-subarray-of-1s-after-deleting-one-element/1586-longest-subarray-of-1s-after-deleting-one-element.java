class Solution {
    public int longestSubarray(int[] nums) {
        int ans = 0;
        int left = 0;
        int zeroes = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroes++;
                // zeroes > 1이라면 left++해서 val을 옮긴 다음에 val == 0이면 zeroes--를 한다.
                while(zeroes > 1) {
                    int val = nums[left++];
                    if(val == 0) {
                        zeroes--;
                    }
                }
            }
            ans = Math.max(ans, i - left);
        }
        return ans;
    }
}