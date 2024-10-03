class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int ans = -1;
        for (Map.Entry<Character, Integer> en : map.entrySet()) {
            if(en.getValue() == 1) {
                char uniq = en.getKey();
                int idx = s.indexOf(uniq);
                if(ans == -1 || idx < ans) {
                    ans = idx;
                }
            }
        }

        return ans;
    }
}