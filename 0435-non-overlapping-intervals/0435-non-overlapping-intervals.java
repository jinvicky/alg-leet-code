class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals == null || intervals.length == 1) return 0;

        // 빨리 끝나는 순으로 오름차순 정렬
        Arrays.sort(intervals, (a,b) -> a[1] - b[1]);

        int total = intervals.length;
        int count = 1;

        int lastEndTime = intervals[0][1];

        for(int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] >= lastEndTime) 
            {
                count++;
                lastEndTime = intervals[i][1];
            } 
        }
        return total - count;
    }
}