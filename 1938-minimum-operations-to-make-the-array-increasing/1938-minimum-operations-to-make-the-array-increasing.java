class Solution {
    public int minOperations(int[] nums) {
        if (nums.length == 1)
            return 0;

        int minOp = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            int cur = nums[i];
            int next = nums[i + 1];

            if (cur < next)
                continue; // 작다면 통과
            else if (cur == next) { // 같다면 다음 요소를 ++하고 통과
                minOp++;
                nums[i+1] = next + 1;
                continue;
            }

            else if(cur >= nums[i+1]) {
                int max = Math.max(cur + 1, nums[i+1]);
                int diff = Math.abs(nums[i+1] - max);

                minOp += diff;
                nums[i+1] = max;
            }

            // while (cur >= nums[i + 1]) { // 지금 요소가 더 크다면 최소 같아질 때까지 반복 연산 
            //     int max = Math.max(cur + 1, next);
            //     int diff = Math.abs(nums[i+1]- max);

            //     minOp+= max;
            //     nums[i+1] =  max;
            // }

            // // 같아졌으니 다음 요소를 ++하고 통과 
            // minOp++;
            // nums[i+1] = nums[i+1] + 1;

            System.out.println(i + " and " +minOp);
        }
        return minOp;
    }
}