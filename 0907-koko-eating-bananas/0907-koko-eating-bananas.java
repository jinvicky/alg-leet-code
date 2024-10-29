class Solution {
   public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles); // 이 문제에서는 더미의 순서, 아이템과 인덱스가 별로 안 중요해서 정렬해도 무방함
        int len = piles.length;
        int start = 1;
        int end = piles[len - 1];

        while(start < end) {
            int speed = (start + end) / 2;
            int time = 0;
            for(int i = 0; i < len; i++) {
                time += Math.ceil((double) piles[i] / speed);
                if(time > h) {
                    start = speed+1;
                    break;
                }
            }

            if(time <= h) {
                end = speed;
            }
        }
        return start;
   }

}