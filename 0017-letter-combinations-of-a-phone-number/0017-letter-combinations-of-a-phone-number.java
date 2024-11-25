class Solution {
    private static char[][] dfs;

    private void initAlphaDict(Map<Character, String> map) {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        List<String> answer = new ArrayList<>();
        Map<Character, String> map = new HashMap<>();
        initAlphaDict(map);

        if (digits.length() == 1) {
            return Arrays.stream(map.get(digits.charAt(0)).split("")).toList();
        }

        // 길이가 2~4인 경우
        // w: 3~4
        // h: 2~4
        dfs = new char[digits.length()][4]; // 이러면 안됨... backtracking의 재귀 개념만 가지고 와야지 이건 하드코딩이 됨....
        for (int h = 0; h < digits.length(); h++) {
            char[] toCharArr = map.get(digits.charAt(h)).toCharArray(); // "abc" || "def"....
            for (int k = 0; k < toCharArr.length; k++) {
                dfs[h][k] = toCharArr[k];
            }
        }

        String comb = "";
//        backTracking(0, comb, answer);
        backtrack(digits, 0, new StringBuilder(), answer, map);

        return answer;
    }
    
    private void backtrack(String digits, int idx, StringBuilder comb, List<String> res, Map<Character, String> digitToLetters) {
        if (idx == digits.length()) {
            res.add(comb.toString());
            return;
        }

        String letters = digitToLetters.get(digits.charAt(idx));
        for (char letter : letters.toCharArray()) {
            comb.append(letter);
            backtrack(digits, idx + 1, comb, res, digitToLetters);
            comb.deleteCharAt(comb.length() - 1);
        }
    }
}