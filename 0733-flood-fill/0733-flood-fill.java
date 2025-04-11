class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        if(image[sr][sc] == color) {
            return image;
        }

        int startColor = image[sr][sc];

        fill(image, sr, sc, startColor, color);
        return image;
    }

    public void fill(int[][] image, int sr, int sc, int startColor, int newColor) {
        if(sr < 0 || sc < 0) return;
        if(sr >= image.length || sc >= image[0].length) return;
        if(image[sr][sc] != startColor) return;

        image[sr][sc] = newColor;

        fill(image, sr - 1, sc, startColor, newColor);
        fill(image, sr + 1, sc, startColor, newColor);
        fill(image, sr, sc - 1, startColor, newColor);
        fill(image, sr, sc + 1, startColor, newColor);
    }
}