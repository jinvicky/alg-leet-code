class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] answer = new int[arr1.length];
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();

        // 배열에 저장
        for (int k = 0; k < arr1.length; k++) {
            List<Integer> list = map.getOrDefault(arr1[k], new ArrayList<>());
            list.add(k);
            map.put(arr1[k], list);
        }

        // arr2를 돌면서 출력 
        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            int n = arr2[i];
            List<Integer> list = map.get(n); // 숫자를 가진 인덱스들

            // map value만큼 for돌리고 map에서 삭제
            for (int nl : list) {
                answer[index] = arr1[nl];
                index++;
            }
            map.remove(n);
        }

        // 그대로 map을 순환해서 add
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            int k = entry.getKey();
            List<Integer> v = entry.getValue();

            // map value만큼 for돌리고 map에서 삭제
            for (int nl : v) {
                answer[index] = arr1[nl];
                index++;
            }
        }
        return answer;
    }
}