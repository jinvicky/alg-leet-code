class Solution {
    public int[][] merge(int[][] intervals) {
        // 1. [0]번째 위주로 오름차순 정렬한다. 
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // [0], [1] 을 start, end로 선언한다. 
        int start = intervals[0][0];
        int end = intervals[0][1];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < intervals.length; i++) {
            int curS = intervals[i][0];
            int curE = intervals[i][1];

            if(curS <= end) {
                end = Math.max(curE, end);
            } else {

                // start = Math.max(curS, start);
                // end = Math.max(curE, end);
                start = curS;
                end = curE;
            }

            map.put(start, end);
        }

        // 왜 int[][]인지를 모르겠네. 가변인데
        // 일단 map에 때려박고 마지막에 int[][]로 정렬하나?


        // System.out.println(map);
        int[][] answer = new int[map.size()][2];

        int idx = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int[] item = new int[]{entry.getKey(), entry.getValue()};
            answer[idx] = item;
            idx++;
        }

        return answer;
    }
}