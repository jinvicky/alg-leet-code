class Solution {
    public int missingNumber(int[] nums) {
        /**
            n은 nums.length와 같습니다. 
            0부터 nums.length까지의 값들 중에서 없는 값을 반환하면 됩니다.
            단 O(n)으로 한다면 좋겠습니다. -> 그냥 O(n**2)만 피해도 굿
        
        
        
         */
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 0;
    }
}