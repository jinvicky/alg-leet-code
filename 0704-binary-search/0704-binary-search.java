class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] == target) {
                return mid;
            }

            if(target < nums[mid]) { // 값이 start에 가까운 경우
                end = mid - 1;
            } 

            if(target > nums[mid]) { // 값이 end에 가까운 경우
                start = mid + 1;
            }
        }
        return -1;
    }
}