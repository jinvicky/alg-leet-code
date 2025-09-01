class Solution {

    public int[][] imageSmoother(int[][] img) {
        int[][] dir8 = new int[][] {
            {-1, 0}, 
            {-1, 1}, 
            {0,  1}, 
            {1,  1}, 
            {1,  0}, 
            {1, -1}, 
            {0, -1}, 
            {-1,-1}
        };

        int[][] assist = new int[img.length][img[0].length];

        for(int i = 0; i < img.length; i++) {
            for(int j = 0; j < img[0].length; j++) {
                // dir의 8을 돌린다. 
                int sum = img[i][j];
                int cnt = 1;
                for(int[] d : dir8) {
                    int ni = i + d[0];
                    int nj = j + d[1];

                    if(ni < 0 || ni >= img.length || nj < 0 || nj >= img[0].length) {
                        continue;
                    }

                    sum+= img[ni][nj];
                    cnt++;
                }
                assist[i][j] = sum / cnt;
            }
        }
        return assist;
    }
}