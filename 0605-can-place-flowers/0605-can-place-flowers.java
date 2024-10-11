class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int ans = 0;

        int[] temp = new int[flowerbed.length];

        for(int i = 0; i < flowerbed.length ; i++) {
            int item = flowerbed[i];

            if(flowerbed[i] == 1) {
                temp[i] = -999;

                if(i + 1 < flowerbed.length) {
                    temp[i+1] = -999;
                }

                if(i -1 >= 0 && flowerbed[i-1] != -999) {
                    temp[i-1] = -999;
                }
            }

        }

        for(int j = 0; j < temp.length; j++) {
            if(temp[j] != -999) {
                ans++;

                if(j + 1 < temp.length) {
                    temp[j + 1] = -999;
                }
            }
        }
        return ans >= n;
    }
}