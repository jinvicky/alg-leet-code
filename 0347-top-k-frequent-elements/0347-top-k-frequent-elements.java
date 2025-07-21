class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums) map.put(i, map.getOrDefault(i,0)+1);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int key: map.keySet()){
            pq.add(new int[]{map.get(key), key});
            if(pq.size()>k) pq.poll();
        }
        
        for(int i=0;i<k;i++) res[i] = pq.poll()[1];
        return res;
    }
}