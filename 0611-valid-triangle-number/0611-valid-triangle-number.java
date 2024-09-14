class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums); //일단 정렬하고 들어가

        int res = 0;
        int n = nums.length;
        int i;
        int j;
        int k;

        for(i = 0; i < n; i++) {
            for(j = i+1, k = j+1; j<(n-1) && k<=n;) {
                if(k == n || nums[i] + nums[j] <= nums[k]) {
                    if(k > (j+1)) {
                        res += k - j - 1;
                    }
                    j++;
                } else {
                    k++;
                }
            }
        }
        return res;
    }
}