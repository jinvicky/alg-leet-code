import java.util.List;

class Solution {
    public int maxSubArray(int[] nums) {
        int currentMax = nums[0];
        // 전체 최대 부분합을 추적하는 변수
        int overallMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // 현재 숫자가 더 큰지, 아니면 이전 부분합에 더한 값이 더 큰지 비교
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            
            // 전체 최대값 업데이트
            overallMax = Math.max(overallMax, currentMax);
        }

        return overallMax;
    }
}