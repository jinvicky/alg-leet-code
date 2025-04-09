import java.util.*;

class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int am : amount) {
            if (am > 0) pq.add(am);
        }

        int time = 0;

        while (!pq.isEmpty()) {
            int first = pq.poll();

            if (pq.isEmpty()) {
                time += first;  // 남은 컵을 1종류만 처리할 때
                break;
            }

            int second = pq.poll();

            first--;
            second--;
            time++;

            if (first > 0) pq.add(first);
            if (second > 0) pq.add(second);
        }

        return time;
    }
}
