class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        // nums1의 요소와 개수를 map1에 저장
        for (int i = 0; i < nums1.length; i++) {
            map1.put(nums1[i], map1.getOrDefault(nums1[i], 0) + 1);
        }

        // nums2의 요소와 개수를 map2에 저장
        for (int j = 0; j < nums2.length; j++) {
            map2.put(nums2[j], map2.getOrDefault(nums2[j], 0) + 1);
        }

        // 두 맵을 비교하여 교집합을 찾기
        List<Integer> intersection = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            // map2에 num이 있으면, 교집합에 추가
            if (map2.containsKey(num)) {
                int minCount = Math.min(count, map2.get(num));
                for (int k = 0; k < minCount; k++) {
                    intersection.add(num);
                }
            }
        }

        // 결과 배열로 변환
        int[] result = new int[intersection.size()];
        for (int k = 0; k < intersection.size(); k++) {
            result[k] = intersection.get(k);
        }

        return result;
    }
}
