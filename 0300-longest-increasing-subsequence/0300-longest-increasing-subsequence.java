import java.util.*;

class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> tails = new ArrayList<>(); // 길이 k인 증가 수열의 "꼬리 최솟값"들

        for (int x : nums) {
            int idx = Collections.binarySearch(tails, x);
            if (idx < 0) idx = -(idx + 1);   // ★ 음수면 삽입 위치로 변환 (lower_bound)

            if (idx == tails.size()) {
                tails.add(x);                // 가장 크면 뒤에 추가 → 길이 +1
            } else {
                tails.set(idx, x);           // 아니면 그 자리의 꼬리를 더 작은 x로 교체
            }
        }
        return tails.size(); // 꼬리 배열 길이 = LIS 길이
    }
}
