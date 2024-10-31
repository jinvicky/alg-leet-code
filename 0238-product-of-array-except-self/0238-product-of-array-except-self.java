class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int zeroCount = 0;

        arr[0] = nums[0];
        if(nums[0] == 0) {
            zeroCount++;
            arr[0] = 1;
        }
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == 0) {
                zeroCount++;
                arr[i] = arr[i - 1];

            } else {
                arr[i] = arr[i - 1] * nums[i];
            }
        }

        if (zeroCount > 1) {
            return new int[nums.length];
        } else if (zeroCount == 1) {
            int[] result = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    result[i] = arr[nums.length - 1];
                }
            }
            return result;
        } else {
            // 0이 없는 경우
            int[] result = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                result[i] = arr[nums.length - 1] / nums[i];

            }
            return result;
        }
    }
}