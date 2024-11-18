class Solution {
     public long totalCost(int[] costs, int k, int candidates) {
        final Queue<Integer> left = new PriorityQueue<>();
        final Queue<Integer> right = new PriorityQueue<>();

        final int n = costs.length;
        int i = 0;
        int j = n - 1;

        long result = 0L;

        while (k-- > 0) {
            while (right.size() < candidates && i <= j) {
                right.offer(costs[j--]);
            }

            while (left.size() < candidates && i <= j) {
                left.offer(costs[i++]);
            }

            if (!left.isEmpty() && !right.isEmpty()) {
                result += left.peek() <= right.peek() ? left.poll() : right.poll();
            } else if (!left.isEmpty()) {
                result += left.poll();
            } else {
                result += right.poll();
            }
        }
        return result;
    }
}