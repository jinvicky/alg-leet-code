class Solution {
    public int findMaxLength(int[] nums) {
        int[] prefixSums = new int[nums.length];
        int zCnt = 0;
        int fCnt = 0;


        for(int i = 0; i < prefixSums.length; i++) {
            int item = nums[i];
            if(item == 0) {
                zCnt++;
            } else {
                fCnt++;
            }

            if(i == 0) {
                prefixSums[i] = 0;
                continue;
            }

            if(zCnt != 0 && fCnt != 0) {
                prefixSums[i] = Math.min(zCnt, fCnt);
            } else {
                prefixSums[i] = prefixSums[i-1];
            }
        }

        return prefixSums[nums.length - 1] * 2;
    }
}