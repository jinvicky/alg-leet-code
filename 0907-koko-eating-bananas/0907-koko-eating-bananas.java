class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // 무조건 Arrays.sort()했다고 성능이 나아지는 게 아니었다;; 위에 거에 sort()했더니 성능이 더 나빠짐.
        Arrays.sort(piles);
        int min = 1;
        int max = piles[piles.length - 1];

        while(min<max) {
            int mid = min + (max - min) / 2;
            if(canEat(mid, piles) > h) {
                min=mid+1;
            }else {
                max=mid;
            }
        }
        return min;
    }
    
    public int canEat(int mid, int[] piles) {
        int n = 0;
        for(int pile : piles) {
            n = n + (pile + mid - 1)/mid;
        }
        return n;
    }
}