class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> m1 = new HashMap<>();
        Map<Integer, Integer> m2 = new HashMap<>();

        for (int item : arr) {
            if (!m1.containsKey(item)) {
                m1.put(item, 0);
            } else {
                m1.put(item, m1.get(item) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> m : m1.entrySet()) {
            Integer key = m.getKey();
            Integer value = m1.get(key);

            m2.put(value, key);
        }
        return m1.size() == m2.size();
    }
}