class Solution {
    public int rob(int[] nums) {
        if (nums.length==1) return nums[0];
        else if (nums.length == 2)
            return Math.max(nums[0], nums[1]);
        else if (nums.length == 3) {
            return Math.max(Math.max(nums[0], nums[1]), nums[2]);
        }

        int n = nums.length;
       // 첫째 요소만 포함한 dp (마지막 요소 포함 X)
        int[] firstDp = new int[n-1];
        firstDp[0] = nums[0];
        for(int i = 1; i < n-1; i++) {
            int prev2AndNowRob = (i - 2 < 0 ? 0 : firstDp[i - 2]) + nums[i];
            int prev1Rob = firstDp[i-1];

            firstDp[i] = Math.max(prev2AndNowRob, prev1Rob);
        }
        // System.out.println(firstDp[n-2]); // ok

        // 마지막 요소만 포함한 dp (첫번째 요소 포함 X)
        int[] lastDp = new int[n];
        lastDp[1] = nums[1];
        for(int i = 2; i < n; i++) {
            int prev2AndNowRob = (i - 2 < 1 ? 0 : lastDp[i-2]) + nums[i];
            int prev1Rob = lastDp[i-1];

            lastDp[i] = Math.max(prev2AndNowRob, prev1Rob);
        }
        System.out.println(lastDp[n-1]); // ok

        return Math.max(firstDp[n-2], lastDp[n-1]);
    }
}