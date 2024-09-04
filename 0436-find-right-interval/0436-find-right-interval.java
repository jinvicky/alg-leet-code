class Solution {
    public int[] findRightInterval(int[][] intervals) {
        Map<Integer, Integer> startIndexMap = new HashMap<>();
        int[] starts = new int[intervals.length];

        // start 배열과 startIndexMap 초기화
        for (int i = 0; i < intervals.length; i++) {
            starts[i] = intervals[i][0];
            startIndexMap.put(intervals[i][0], i);
        }

        Arrays.sort(starts); // start 배열 정렬

        int[] result = new int[intervals.length];

        // 각 interval에 대해 이진 탐색 수행
        for (int i = 0; i < intervals.length; i++) {
            int end = intervals[i][1];
            int start = 0;
            int endIdx = starts.length - 1;
            int foundIdx = -1;

            // 이진 탐색
            while (start <= endIdx) {
                int mid = start + (endIdx - start) / 2;

                if (starts[mid] >= end) {
                    foundIdx = startIndexMap.get(starts[mid]);
                    endIdx = mid - 1; // 최소 start를 찾기 위해 왼쪽으로 이동
                } else {
                    start = mid + 1;
                }
            }

            result[i] = foundIdx; // 찾은 index를 결과에 저장
        }

        return result;
    }
}
