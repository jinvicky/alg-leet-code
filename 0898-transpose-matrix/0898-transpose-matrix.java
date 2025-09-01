class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] answer = new int[matrix[0].length][matrix.length];

        int j = 0;

        while (j < matrix[0].length) {
            for (int i = 0; i < matrix.length; i++) {
                answer[j][i] = matrix[i][j];
            }
            j++;
        }
        return answer;
    }
}