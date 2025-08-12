class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        // 배열이 회전되지 않은 경우 (이미 정렬되어 있는 경우)
        if (nums[right] >= nums[left]) {
            return nums[left];
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            // mid가 right보다 크다면, 최소값은 mid의 오른쪽에 있다.
            // 예를 들어 [3, 4, 5, 1, 2] -> mid=5. 최소값은 오른쪽에 있다.
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } 
            // mid가 right보다 작다면, 최소값은 mid이거나 mid의 왼쪽에 있다.
            // 예를 들어 [5, 1, 2, 3, 4] -> mid=2. 최소값은 mid이거나 왼쪽에 있다.
            else {
                right = mid;
            }
        }
        
        // 반복문이 끝나면 left와 right는 최소값을 가리킨다.
        return nums[left];
    }
}