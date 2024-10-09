class Solution {
      public int minSubArrayLen(int target, int[] nums) {
        int p = 0;
        int ml = 0;
        int sum = 0;


        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                int newMl = i - p + 1;

                if(ml == 0) {
                    ml = newMl;
                }

                if(newMl < ml) {
                    ml = newMl;
                }
                
                sum -= nums[p];
                p++;

            }
        }
        return ml;
    }
}