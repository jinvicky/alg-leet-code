class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int pfSum = 0; // 가중치 합
        int leftSum = 0; // 전체 - 가중치 합
        int total = 0; // 전체
        List<Integer> answer = new ArrayList<>();

        // 일단 전체 합계를 leftSum에 누적 
        for(int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        // 조건을 만족하는 subarray 찾기
        for(int i = nums.length - 1; i >= 0; i--) {
            pfSum += nums[i];
            leftSum = total - pfSum;

            if(pfSum > leftSum) {
                // 정답을 return;
                int slice = i;
                
                for(int k = nums.length - 1; k >= i; k--) {
                    answer.add(nums[k]);
                }
                return answer;
            }
        }

        return answer;
    }
}