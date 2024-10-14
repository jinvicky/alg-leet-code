class Solution {
    // public boolean uniqueOccurrences(int[] arr) {
    //     Map<Integer, Integer> m1 = new HashMap<>();
    //     Map<Integer, Integer> m2 = new HashMap<>();

    //     for (int item : arr) {
    //         if (!m1.containsKey(item)) {
    //             m1.put(item, 0);
    //         } else {
    //             m1.put(item, m1.get(item) + 1);
    //         }
    //     }

    //     for (Map.Entry<Integer, Integer> m : m1.entrySet()) {
    //         Integer key = m.getKey();
    //         Integer value = m1.get(key);

    //         m2.put(value, key);
    //     }
    //     return m1.size() == m2.size();
    // }

     public boolean uniqueOccurrences(int[] arr) {
        // 각 숫자의 빈도수를 저장하기 위한 HashMap
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
        // 빈도수 계산
        for (int x : arr) {
            freqMap.put(x, freqMap.getOrDefault(x, 0) + 1);
        }

        // 빈도수를 저장할 HashSet
        HashSet<Integer> freqSet = new HashSet<>();
        
        // 빈도수 체크
        for (int count : freqMap.values()) {
            // 이미 존재하는 빈도수라면 false 반환
            if (!freqSet.add(count)) {
                return false;
            }
        }

        return true; // 모든 빈도수가 유일하다면 true 반환
    }
}