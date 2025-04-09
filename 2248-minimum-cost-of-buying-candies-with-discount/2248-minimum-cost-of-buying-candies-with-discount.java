class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        if (cost.length == 2) {
            return cost[0] + cost[1]; // 2개면 전부 구매
        }

        int minCost = 0;
        int index = cost.length - 1;
        int buyCnt = 0;
        while (index >= 0) {
            if (buyCnt < 2) {
                minCost += cost[index];
                buyCnt++;
            } else { // buyCnt == 2
                buyCnt = 0;
            }
            index -= 1;

            if(index < 0) {
                // 범위를 벗어난 경우 break;
                break;
            }
        }
        return minCost;
    }
}