class Solution {
  public int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];

        for(int i = 1; i < nums.length; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i-1];
        }
        for (int i = nums.length - 2 ; i >= 0; i--) {
//            System.out.println("i  = " + i );
            rightSum[i] = rightSum[i + 1] + nums[i+1];
        }

        int[] answer = new int[nums.length];
        for(int i = 0; i < answer.length; i++) {
//            System.out.println("leftSum = " + leftSum[i]);
//            System.out.println("rightSum = " + rightSum[i]);
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return answer;
    }
}