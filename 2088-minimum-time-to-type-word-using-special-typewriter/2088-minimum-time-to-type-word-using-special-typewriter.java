class Solution {
    public int minTimeToType(String word) {
        int clock = 0;
        char prevC = 'a';
        Map<Character, int[]> map = new HashMap<>();

        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            map.put(c, new int[] { i, i + 26 });
        }

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i); // 알파벳 가지고 옴.

            clock+=1; // 타이핑 시간도 추가
            clock+= getMin(map.get(c), map.get(prevC));
            prevC = c;
        }
        return clock;
    }

    private int getMin (int[] a, int[]b) {
        int min = Integer.MAX_VALUE;
        for(int i : a) {
            for(int j : b) {
            min = Math.min(min, Math.abs(i - j)); // i와 j의 차이의 절대값을 계산
            }
        }
        return min;
    }
}