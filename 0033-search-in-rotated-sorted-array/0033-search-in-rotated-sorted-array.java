class Solution {
    public int search(int[] nums, int target) {
        int[] copy = nums.clone();
        Arrays.sort(copy);

        int value = binarySearch(copy, target);
        if(value == -1) {
            return -1;
        } else {
            // 이제 이 value를 가지고 nums에서 몇번째 인덱스인지 찾아야 한다.
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] == copy[value]) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int binarySearch(int[] copy, int target) {
        int start = 0;
        int end = copy.length - 1;

        while(start <= end) {
            int mid = start + (end - start ) / 2;

            if(target < copy[mid]) {
                end = mid - 1;
            }

            if(target > copy[mid]) {
                start = mid + 1;
            }

            if(target == copy[mid]) {
                return mid;
            }
        }
        return -1;
    }
}