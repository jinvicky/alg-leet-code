class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] newArr = new int[nums.length];

        int leftValue = 1;
        for(int i = 0;i<nums.length;i++){
            newArr[i] = leftValue;
            leftValue*=nums[i];
        }

        int rightValue = 1;
        for(int i = nums.length-1;i>=0;i--){
            newArr[i]*=rightValue;
            rightValue*= nums[i];
        }

        return newArr;
    }
}

/*
1 2 3 4
1 1 2 6
24  12  8  6 
1 4 12 24 
*/