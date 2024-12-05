class Solution {
 public int twoCitySchedCost(int[][] costs) {
        Map<Integer, Queue<Integer>> diffMap = new HashMap<>(); // { 비용차이 : 인덱스 리스트 }
        int[] diffArr = new int[costs.length];

        // 비용 차이 계산 및 맵에 저장
        for (int i = 0; i < costs.length; i++) {
            int diff = costs[i][0] - costs[i][1];
            diffArr[i] = diff;
            // 차이에 해당하는 인덱스를 리스트에 추가
            diffMap.computeIfAbsent(diff, k -> new LinkedList<>()).add(i);
        }

        // 차이값 배열을 오름차순 정렬
        Arrays.sort(diffArr);

        int n = costs.length / 2; // A에 담을 배열의 개수
        int minSum = 0;

        int counter = 0;
        for (int i = 0; i < diffArr.length; i++) {
            int diff = diffArr[i];
            Queue<Integer> q = diffMap.get(diff);

            // A 도시로 보낼 경우
            // 큐가 비지 않았을 동안 i < n으로 인덱스만 분기처리해서 계속 뽑아 넣어야 하는 것 아닌가?
            while (!q.isEmpty()) {
                int index = q.poll(); // 0,1,2,3
                if(counter < n) {
                    minSum += costs[index][0];
                    counter++;
                } else {
                    minSum += costs[index][1];
                    counter++;
                }
            }
        }
        return minSum;
    }
}