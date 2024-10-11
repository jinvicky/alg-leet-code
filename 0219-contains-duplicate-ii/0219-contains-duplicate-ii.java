class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int item = nums[i];

            if(!map.containsKey(item)) {
                map.put(item, i);
            } else {
                int val = map.get(item);

                if(i - val <= k) {
                    return true;
                }
                map.put(item, Math.max(val, i));
            }
        }
        return false;
    }
}