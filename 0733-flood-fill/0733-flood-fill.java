class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int fromColor = image[sr][sc];
        if (color == fromColor) return image;

        dfs(image, sr, sc, fromColor, color);
        return image;
    }

    private void dfs(int[][] image, int i, int j, int fromColor, int toColor) {
        // 범위를 벗어나면 리턴 
        if (i < 0 || i >= image.length || j < 0 || j >= image[0].length) {
            return;
        }
        // 조건을 만족하면=> 시작 픽셀의 이웃이라면 image[i][j]를 color로 칠한다.
        if (image[i][j] != fromColor)
            return;

        // 방문 처리
        image[i][j] = toColor;

        dfs(image, i + 1, j, fromColor, toColor);
        dfs(image, i - 1, j, fromColor, toColor);
        dfs(image, i, j + 1, fromColor, toColor);
        dfs(image, i, j - 1, fromColor, toColor);
    }
}