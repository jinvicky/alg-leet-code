class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        /** 
            타겟값을 만족하는 두 요소의 인덱스를 배열에 담아 반환하라.  
            정답 케이스는 단 1개다.       
        */      

        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return answer;
    }
}