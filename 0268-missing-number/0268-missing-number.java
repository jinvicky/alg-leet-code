class Solution {
    public int missingNumber(int[] nums) {
        /**
            n은 nums.length와 같습니다. 
            0부터 nums.length까지의 값들 중에서 없는 값을 반환하면 됩니다.
            단 O(n)으로 한다면 좋겠습니다. -> 그냥 O(n**2)만 피해도 굿
        
            O(n) 성능으로 최적화한다.
            0이 missing 자리에 들어가서 생긴 문제니 0 제외부터? -> 0이 맨 처음이 아니기 때문에 불가능.
         */
        int arrayTotal = 0;
        for (int n : nums) {
            arrayTotal += n;
        }

        int numberTotal = 0;
        for (int i = 1; i <= nums.length; i++) {
            numberTotal += i;
        }
        return numberTotal - arrayTotal;
    }
}