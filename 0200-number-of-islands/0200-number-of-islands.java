class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int current = dfs(grid, visited, i, j);
                if (current > 0)
                    count++;
            }
        }
        return count;
    }

    public int dfs(char[][] grid, boolean[][] visited, int i, int j) {

        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            // 범위를 벗어나면 break;를 의미하는 0
            return 0;
        }

        if (visited[i][j] || grid[i][j] == '0') {
            return 0;
        }

        visited[i][j] = true;

        int count = 1;

        count += dfs(grid, visited, i + 1, j);
        count += dfs(grid, visited, i - 1, j);
        count += dfs(grid, visited, i, j + 1);
        count += dfs(grid, visited, i, j - 1);

        return count;
    }
}
