/**
    본래 brute force로 이중 for문으로 풀었다가 
    map으로 최적화를 시도.
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[2];
    }

    // public int[] twoSumByBruteForce(int[] nums, int target) {

    // }
}