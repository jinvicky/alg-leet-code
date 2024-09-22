class Solution {
    public int numSubseq(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);

        int[] exp = new int[n];
        exp[0] = 1;
        int modular = 1000000007;

        for(int i = 1; i < n; i++) {
            exp[i] = (exp[i-1] * 2) % modular;
        }

        int i = 0;
        int j = n - 1;
        int cnt = 0;

        while(i<=j) {
            if(nums[i] + nums[j] <= target) {
                cnt = (cnt + exp[j-i]) % modular;
                i++;
            } else {
                j--;
            }
        }
        return cnt;
    }
}