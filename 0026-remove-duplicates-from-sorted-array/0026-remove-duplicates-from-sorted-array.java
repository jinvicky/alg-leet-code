class Solution {
    public int removeDuplicates(int[] nums) {
        int insertIdx = 0;

        for(int i = 0; i < nums.length; i++) {
            if(i == 0 || nums[i] != nums[i-1]) {
                nums[insertIdx] = nums[i];
                insertIdx++;
            }
        }
        // 개수를 리턴하려면 전체 배열 길이에서 insertIdx를 빼면 되지 않을까? 

        System.out.println(insertIdx);

        // if(insertIdx - 1 == nums.length) {
        //     return nums.length - insertIdx + 1;
        // }
        return nums.length - (nums.length - insertIdx);
    }


}