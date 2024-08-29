class Solution {
    public int[] searchRange(int[] nums, int target) {
        int x = target;
        int n = nums.length;
        int first = -1;
        int last = -1;

        for(int i = 0; i < n; i++) {
            if(x != nums[i]) {
                continue;
            }
            if(first == -1) {
                first = i;
            }
            last = i;
        }

        if(first != -1) {
            return new int[]{first, last};
        } else {
            return new int[]{-1, -1};
        }
    }
}