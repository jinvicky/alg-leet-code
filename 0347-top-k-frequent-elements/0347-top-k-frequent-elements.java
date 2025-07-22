class Solution {
     public int[] topKFrequent(int[] nums, int k) {
        int[] answer = new int[k];

        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (int key : map.keySet()) {
            pq.add(new int[]{map.get(key), key});
            if (pq.size() > k) {
                pq.poll();
            }
        }

        for (int i = 0; i < k; i++) {
            if (!pq.isEmpty()) {
                answer[i] = pq.poll()[1];
            }
        }
        return answer;
    }
}