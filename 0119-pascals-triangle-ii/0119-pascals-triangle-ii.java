class Solution {
    public List<Integer> getRow(int numRows) {
        int[][] dp = new int[numRows+1][numRows+1]; // 혹은 [6][6]?
        List<List<Integer>> answer = new ArrayList<>();
        if (numRows == 0)
            return List.of(1);
        if (numRows == 1)
            return List.of(1, 1);

        answer.add(new ArrayList<>(List.of(1)));
        // DP 초기화 로직: 모든 줄의 양끝을 1로 초기화한다.
        for (int i = 0; i <= numRows; i++) {
            dp[i][i] = 1;
            dp[i][0] = 1;
        }

        answer.add(new ArrayList<>(List.of(1, 1)));

        for (int i = 2; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1); // 시작을 1로 고정한다.
            for (int j = 1; j < i; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j]; // 내 위와 내 왼쪽 대각선을 더한다.
                row.add(dp[i][j]);
            }
            row.add(1); // 끝을 1로 고정한다.
            answer.add(row);
        }
        return answer.get(numRows);
    }
}