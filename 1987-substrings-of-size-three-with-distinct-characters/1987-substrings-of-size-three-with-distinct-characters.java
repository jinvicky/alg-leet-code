class Solution {
    public int countGoodSubstrings(String s) {
        // map으로 짠다음에 ch 중복이 없으면 map의 val을 더하자. 
        Map<String, Integer> map = new HashMap<>();
        int offset = 3;
        for(int i =0; i < s.length(); i++) {
            if(i+offset > s.length()) break;
            String parse = s.substring(i, i+offset);
            map.put(parse, map.getOrDefault(parse, 0) +1);
        }

        // System.out.println(map);

        int max = 0;
        // map을 순회해서 문자열 내 중복을 체크해서 없으면 maxCount++한다. 
        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            String str = entry.getKey();
            int v = entry.getValue();

            // System.out.println(str.charAt(0) + " and " + str.charAt(1) + " and " + str.charAt(2));
            if(str.charAt(0) != str.charAt(1) && str.charAt(1) != str.charAt(2) && str.charAt(0) != str.charAt(2)) {
                max += v;
            }
        }

        return max;
    }
}