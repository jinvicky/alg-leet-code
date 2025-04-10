import java.util.*;

class Solution {
    public int minimumOperations(int[] nums) {
        if (nums.length == 1 && nums[0] == 0)
            return 0;

        Arrays.sort(nums);
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            }
            int key = nums[i];
            for (int j = i; j < nums.length; j++) {
                nums[j] = nums[j] - key;

                System.out.println(nums[j]);
            }
            answer++;
        }

        return answer;
    }
}