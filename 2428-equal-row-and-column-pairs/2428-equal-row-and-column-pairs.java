class Solution {
   public String calcWidth(int[][] grid, int i) {
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < grid.length; k++) {
            sb.append(grid[i][k]).append("-");
        }
        return sb.toString();
    }

    public String calcHeight(int[][] grid, int i) {
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < grid.length; k++) {
            sb.append(grid[k][i]).append("-");
        }
        return sb.toString();
    }

    public int equalPairs(int[][] grid) {
        int ans = 0;
        Map<String, Integer> widthMap = new HashMap<>();
        Map<String, Integer> heightMap = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {
            String wKey = calcWidth(grid, i);
            String hKey = calcHeight(grid, i);
            widthMap.put(wKey, widthMap.getOrDefault(wKey, 0) + 1);
            heightMap.put(hKey, heightMap.getOrDefault(hKey, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : widthMap.entrySet()) {
            if (heightMap.containsKey(entry.getKey())) {
                int hValue = heightMap.get(entry.getKey());
                ans += (hValue  * entry.getValue());
            }
        }
        return ans;
    }
}