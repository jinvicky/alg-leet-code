
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> resultSet = new HashSet<>();
        Arrays.sort(nums); // 먼저 정렬합니다.

        for (int i = 0; i < nums.length; i++) {
            // 중복된 값 처리 (i > 0일 때만)
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // 같은 숫자를 건너뜁니다.
            }

            Set<Integer> seen = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int complement = -nums[i] - nums[j];
                if (seen.contains(complement)) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                    Collections.sort(triplet); // 정렬하여 리스트에 추가합니다.
                    resultSet.add(triplet);
                }
                seen.add(nums[j]);
            }
        }
        return new ArrayList<>(resultSet);
    }
}
