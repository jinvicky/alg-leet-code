class Solution {
    public int findPeakElement(int[] nums) {
       int l = 0;
       int r = nums.length-1;

       while(l < r) { // l < r 이면 시간 초과가 발생한다. 
        int m = l + ((r-l) / 2);
            if(nums[m] < nums[m+1]) {
                l = m + 1;
            } else {
                r = m;
            }
       }
       return l;
    }
}