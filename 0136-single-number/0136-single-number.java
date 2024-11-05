class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }

        Arrays.sort(nums);
        int ans = nums[0];

        for(int i = 1; i< nums.length; i++) {
            // int before = nums[i-1];
            // int result = before ^ nums[i];

            ans = ans ^ nums[i];
            System.out.println(ans);
            
        }
        return ans;
    }
}