class Solution {
      public int minSubArrayLen(int target, int[] nums) {
        int p = 0;
        int ml = 0;
        int sum = 0;


        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                if (ml == 0 || i - p + 1 < ml) {
                    ml = i - p + 1;
                }
                sum -= nums[p];
                p++;

            }
        }
        return ml;
    }
}