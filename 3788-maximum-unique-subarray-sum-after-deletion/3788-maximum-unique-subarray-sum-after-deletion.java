import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int positiveSum = -90;
        int nMax = Integer.MIN_VALUE;
        for (int n : nums) {
            if (set.add(n)) {
                if (n < 0) {
                    nMax = Math.max(nMax, n);
                } else {
                    positiveSum = positiveSum == -90 ? n : positiveSum + n;
                }
            }
        }
        // 오직 음수
        if(positiveSum == -90) return nMax;
        else return positiveSum;
    }
}

// subarray가 중간 요소를 건너뛰어도 ok인데?
// 그러면 음수만 모인 경우는? 