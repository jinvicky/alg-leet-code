class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] result = new int[m][n];

        for(int[] indexes : indices) {
           int r = indexes[0];
           int c = indexes[1];

            // r 연산 
            for(int i = 0; i < n; i++) {
                result[r][i]++;
            }
            // c 연산 
            for(int i = 0; i < m; i++) {
                result[i][c]++;
            }
        }

        int count = 0;
        for(int[] a : result) {
            for (int b : a) {
                if(b % 2 != 0) count++;
            }
        }

        return count;
    }
}