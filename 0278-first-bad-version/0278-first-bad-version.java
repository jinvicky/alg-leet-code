public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;

        while (low < high) {
            int mid = low + (high - low) / 2; // 중간값 계산
            if (isBadVersion(mid)) {
                high = mid; // 잘못된 버전이므로, 범위를 왼쪽으로 줄임
            } else {
                low = mid + 1; // 잘못된 버전이 아니므로, 범위를 오른쪽으로 줄임
            }
        }

        return low; // low가 첫 번째 잘못된 버전
    }
}
