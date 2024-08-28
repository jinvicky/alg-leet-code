class Solution {
    public int countNegatives(int[][] grid) {
         int total = 0;
        for (int i = 0; i < grid.length; i++) {
            int[] item = grid[i];
           for(int j = 0; j < item.length; j++) {
                if(item[j] < 0) {
                     total++;
                }
           }
        }
        return total;
    }
}