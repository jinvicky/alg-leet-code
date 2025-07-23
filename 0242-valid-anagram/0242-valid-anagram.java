class Solution {
    public boolean isAnagram(String s, String t) {
        TreeMap<Character, Integer> map = new TreeMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            Integer v = map.get(c);

            if (v == null)
                return false;

            if (v - 1 == 0) {
                map.remove(c);
            } else
                map.put(c, v - 1);
        }

        return map.size() < 1;
    }
}