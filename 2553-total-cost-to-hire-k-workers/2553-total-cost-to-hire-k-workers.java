class Solution {
     public long totalCost(int[] costs, int k, int candidates) {
        int n = costs.length;
        int l = 0;
        int r = n - 1;

        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        for (int i = 0; i < candidates; i++) {
            if (l <= r) {
                pq1.add(costs[l++]);
            }
            if (l <= r) {
                pq2.add(costs[r--]);
            }
        }
        long cost = 0;

        for(int i = 0; i < k; i++) {
            if(!pq1.isEmpty() && (pq2.isEmpty() || pq1.peek() <= pq2.peek())) {
                cost+=pq1.poll();
                if(l<=r) {
                    pq1.add(costs[l++]);
                }
            } else {
                cost+=pq2.poll();
                if(l<=r) {
                    pq2.add(costs[r--]);
                }
            }
        }
        return cost;
    }
}