class Solution {
    public int arrayPairSum(int[] nums) {
         nums = Arrays.stream(nums)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        int maxSum = 0;

        for(int i = 0; i < nums.length; i+=2) {
            maxSum+= Math.min(nums[i], nums[i+1]);
        }

        return maxSum;
    }
}