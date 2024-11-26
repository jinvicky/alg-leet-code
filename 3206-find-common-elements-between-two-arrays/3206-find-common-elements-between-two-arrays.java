class Solution {
    public int[] findIntersectionValues(int[] nums1,
                                        int[] nums2) {
        /**
         * n1과 n2 배열 사이에서 공통된 숫자를 찾아. 그 숫자가 있는 인덱스들의 총 개수를 구한다.
         */
        Map<Integer, Integer> n1Count = new HashMap<>();
        Map<Integer, Integer> n2Count = new HashMap<>();

        for(int i = 0; i < nums1.length; i++) {
            int count = n1Count.getOrDefault(nums1[i], 0);
            n1Count.put(nums1[i], ++count);
        }

        for(int i = 0; i < nums2.length; i++) {
            int count = n2Count.getOrDefault(nums2[i], 0);
            n2Count.put(nums2[i], ++count);
        }

        int[] answer = new int[]{0,0};
        for(Map.Entry<Integer, Integer> n1 : n1Count.entrySet()) {
            for(Map.Entry<Integer, Integer> n2 : n2Count.entrySet()) {
                if(n1.getKey().equals(n2.getKey())) {
                    answer[0] += n1.getValue();
                    answer[1] += n2.getValue();
                }
            }
        }
        return answer;
    }
}