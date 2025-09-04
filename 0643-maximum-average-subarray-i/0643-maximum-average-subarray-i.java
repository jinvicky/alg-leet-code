class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // end - start == k-1 로 간격 계산

        double maxAvg = 0.0;
        double currentAvg = 0.0;

        for (int i = 0; i < k; i++) {
            maxAvg += nums[i]; // 맨 처음 k개 window 합
        }

        // 현재 평균을 초기값으로 설정
        currentAvg = maxAvg;
        // 최대 평균의 초기값
        maxAvg = maxAvg / k;

        int slide = 0;
        for (int i = k; i < nums.length; i++) {
            currentAvg += nums[i];
            currentAvg -= nums[slide];

            maxAvg = Math.max(maxAvg, currentAvg / k);
            slide++;
        }

        return maxAvg;
    }
}
