import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;

// 큐 초기화 및 오렌지가 전부 썩었는지 여부 체크
        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < cols; c++) {
                if(grid[r][c] == 2) {
                    queue.offer(new int[]{r,c});
                } else if (grid[r][c] == 1) {
                    freshCount++;
                }
            }
        }        

        if(freshCount == 0) return 0; // 이미 모든 오렌지가 썩은 경우 

        int minutes = 0;
        int[][] directions = {{-1, 0}, {1,0}, {0, -1}, {0,1}};

        while(!queue.isEmpty()) {
            int size = queue.size();
            boolean rotted = false;

            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int r = curr[0];
                int c = curr[1];

                for(int[] dir : directions) {
                    int nr = r + dir[0];
                    int nc = c + dir[1];

                    if(nr >= 0 && nc >= 0 && nr < rows && nc < cols && grid[nr][nc] == 1) {
                        grid[nr][nc] = 2;
                        freshCount--; // 오렌지가 썩는다!
                        queue.offer(new int[]{nr, nc});
                        rotted = true;
                    }
                }
            }

            if(rotted) minutes++;
        }

        return freshCount == 0 ? minutes : -1;
    }
}