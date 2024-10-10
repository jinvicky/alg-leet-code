class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = 0;
        double sum = 0;

        for(int j = 0; j < k; j++) {
            sum += nums[j];
        }

        maxAvg = average(sum, k);

        for(int i = k; i < nums.length; i++) {
            sum += nums[i]; // 현재 인덱스의 요소 추가
            sum -= nums[i - k]; // k 이전 인덱스의 요소 제거

            double avgCalc = average(sum, k);
            if(avgCalc > maxAvg) {
                maxAvg = avgCalc; // 최대 평균 업데이트
            }
        }
        return Math.round(maxAvg * 100000) / 100000.0;

        // for(int i = 1; i < nums.length; i++) {
        //     sum += nums[i+k]; // 이게 아니라 i + k 든가 그 식으로 가야함
        //     double avgCalc = average(sum, k);

        //     if(avgCalc > maxAvg) {
        //         maxAvg = avgCalc;
        //     }
        //     sum -= nums[i];
        // }
        // return Math.round(maxAvg * 100000) / 100000.0;
    }

    public double average(double sum, int k) {
        return sum / k;
    }
}