/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 0;
        int end = n;
        int index = n;

        while(start<=end) {
            int mid = start + (end - start) / 2;
            boolean isBad = isBadVersion(mid);

            if(isBad) {
                // 나쁘면 더 start에 가까운 값으로 넣는다.
                index = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return index;
    }
}