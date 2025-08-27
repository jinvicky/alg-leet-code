class Solution {
    public int findLHS(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int n : nums) {
            int v = map.getOrDefault(n, 0);
            map.put(n, v+1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int k = entry.getKey();

            int me = map.getOrDefault(k, 0);
            int prev = map.getOrDefault(k-1, 0);
            int next = map.getOrDefault(k+1, 0);

            if(map.containsKey(k-1)) {
                answer = Math.max(answer, prev+me);
            }

            if(map.containsKey(k+1)) {
                answer = Math.max(answer, me+next);
            }
        }
        return answer;
    }
}