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
                System.out.println(minCost);
                buyCnt++;
                index -= 1;
            } else { // buyCnt == 2


                index -= 1; // 무료 캔디 건너뛴 인덱스 설정
                buyCnt = 0;
            }

            if(index < 0) {
                // 범위를 벗어난 경우 break;
                break;
            }
        }
        return minCost;
    }
}