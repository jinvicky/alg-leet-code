class Solution {
    // public int[] sortedSquares(int[] nums) {
    //     int[] answer = new int[nums.length];
        
    //     for(int i = 0; i < answer.length; i++) {
    //         answer[i] = (int) Math.pow(nums[i], 2);
    //     }

    //     Arrays.sort(answer);
    //     return answer;
    // }

    public int[] sortedSquares(int[] nums) {
        int res[] = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int write = nums.length - 1;

        while(left <= right) {
            int pLeft = nums[left]*nums[left];
            int pRight = nums[right] * nums[right];
            if(pLeft >= pRight) {
                res[write] = pLeft;
                left++;
            } else {
                res[write] = pRight;
                right--;
            }
            write--;
        }
        return res;
    }
}