class Solution {
    public int majorityElement(int[] nums) {
        /**
            major가 되기 위해서는 n/2를 초과해야 합니다. 
            major 요소는 배열에 100% 존재합니다. 
        
            각 n별로 major 초과의 빈도수를 가지는 지 확인하는 map이 필요합니다.
         */
        int major = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            if (map.getOrDefault(n, 0) + 1 > major) {
                return n;
            }
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        return 0;
    }
}