class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();

        while (left < right) {
            int mid = (left+right) / 2;
            if(canDo(mid, h, piles)) {
                right = mid;
            } else {
                left = mid+1;
            }

        }
        return left;
    }

    public static boolean canDo(int k, int h, int[] piles ) {
        int hour = 0;
        for(int p : piles) {
            hour += (k+p - 1) / k;
        }
        return hour <= h;
    }
}