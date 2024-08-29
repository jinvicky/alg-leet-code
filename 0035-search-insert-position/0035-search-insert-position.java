class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(target == nums[mid]) {
                return mid;
            }

            if(target < nums[mid]) {
                right = mid - 1;
            }

            if(target > nums[mid]) {
                left = mid + 1;
            }
        }
        // 이제 이걸 -1 대신 index로 대체
        return left;
    }
}