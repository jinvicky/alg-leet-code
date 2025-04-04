class Solution {
      public int convertTime(String current, String correct) {
        String[] curr = current.split(":");
        String[] corr = correct.split(":");

        int curSum = 0;
        int corSum = 0;

        curSum+=Integer.parseInt(curr[0]) * 60;
        corSum+=Integer.parseInt(corr[0]) * 60;
        curSum+=Integer.parseInt(curr[1]);
        corSum+=Integer.parseInt(corr[1]);

        int neededTime = corSum-curSum;
        int answer = 0;

        int[] times = new int[]{60, 15, 5, 1};
        for(int tm : times) {
            answer += neededTime / tm;
            neededTime %= tm;
        }

        return answer;
    }
}