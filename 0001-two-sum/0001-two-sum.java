class Solution {
      public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[]{0,1};
        if (nums.length == 2) {
            return new int[]{0, 1};
        }


        // 1. brute force (O(n^2))
//        for(int i = 0; i < nums.length; i++) {
//            for(int j = 0; j < nums.length; j++) {
//                if(nums[i] + nums[j] == target) {
//                    ans = Arrays.stream(new int[]{i, j}).sorted().toArray();
//                }
//            }
//        }

        Map<Integer, Integer> map = new HashMap<>();

        // 맵에 target - nums[i]에 해당하는 값이 있는지를 체크한다. 없으면 현재 요소를 map에 넣는다.
        // {nums[i], index}

        for (int i = 0; i < nums.length; i++) {
            int search = target - nums[i];

            if(map.containsKey(search)) {
                // 분명 map의 value가 nums[i]보다 앞에 있을 것이다.
                int leftIndex = map.get(search);
                return new int[]{leftIndex, i};
            } else {
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}