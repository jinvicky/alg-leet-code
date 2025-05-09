class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int fbSum = 0;
        for(int i = 0; i < flowerbed.length; i++) {
            fbSum = (i==0 ? 0 : flowerbed[i-1]) + (i == flowerbed.length - 1 ? 0 : flowerbed[i+1]);
            if(fbSum < 1 && flowerbed[i] == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }
        return n < 1; // 모든 꽃을 심었다. 
    }
}