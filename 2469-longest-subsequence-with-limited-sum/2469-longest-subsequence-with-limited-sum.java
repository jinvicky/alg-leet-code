class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);

        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int left = 0;
            int right = nums.length;
            int query = queries[i];

            while (left < right) {
                int mid = (left + right) / 2;

                if (prefix[mid] <= query) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            answer[i] = left;
        }
        return answer;
    }
}