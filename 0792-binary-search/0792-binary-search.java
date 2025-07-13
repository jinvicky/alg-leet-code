class Solution {
    public int search(int[] nums, int target) {
        /**
            n들은 오름차순으로 정렬되어 있고, 중복이 없다. 
            target을 찾으면 그 n의 인덱스를, 없으면 -1을 반환한다. 
         */

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2; // left + (right - left) / 2; 이거였나 기억이 안나네.

            if (nums[middle] == target)
                return middle;
            else if (nums[middle] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}