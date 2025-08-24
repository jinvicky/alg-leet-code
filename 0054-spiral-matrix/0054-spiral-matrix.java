import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        if (m == 0) return ans;
        int n = matrix[0].length;

        boolean[][] visited = new boolean[m][n];

        // 방향: → ↓ ← ↑
        int[] di = {0, 1, 0, -1};
        int[] dj = {1, 0, -1, 0};

        int i = 0, j = 0, dir = 0;

        for (int k = 0; k < m * n; k++) {
            ans.add(matrix[i][j]);
            visited[i][j] = true;

            int ni = i + di[dir];
            int nj = j + dj[dir];

            // 경계 밖이거나 이미 방문 → 방향 전환
            if (ni < 0 || ni >= m || nj < 0 || nj >= n || visited[ni][nj]) {
                dir = (dir + 1) % 4;
                ni = i + di[dir];
                nj = j + dj[dir];
            }

            i = ni;
            j = nj;
        }
        return ans;
    }
}
