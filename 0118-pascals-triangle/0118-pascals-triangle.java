class Solution {
    public List<List<Integer>> generate(int numRows) {
        int[][] dp = new int[numRows][numRows]; // 혹은 [6][6]?
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>(List.of(1)));

        if (numRows == 1)
            return answer;

        for (int i = 0; i < numRows; i++) {
            dp[i][i] = 1;
            dp[i][0] = 1;
        } // 양 대각선을 초기화

        answer.add(new ArrayList<>(List.of(1, 1)));

        for (int i = 2; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                System.out.println(i + " and " + j);

                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j]; // 내 위와 내 왼쪽 대각선을 더한다.

                row.add(dp[i][j]);
            }
            row.add(1);
            answer.add(row);
        }

        return answer;
    }
}