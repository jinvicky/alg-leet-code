class Solution {
    public void setZeroes(int[][] matrix) {
        int[][] assist = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {

                    for(int ni = 0; ni < matrix.length; ni++) {
                        assist[ni][j] = -1;
                    }

                    for(int nj = 0; nj < matrix[0].length; nj++) {
                        assist[i][nj] = -1;
                    }
                }
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                // assist[i][j]가 -1이면 0으로 바꾼다. 
                System.out.println(assist[i][j]);

                if(assist[i][j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }

    }

}