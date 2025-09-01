class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] answer = new int[matrix[0].length][matrix.length];

        for(int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                answer[j][i] = matrix[i][j];
            }
        }
        return answer;
    }
}