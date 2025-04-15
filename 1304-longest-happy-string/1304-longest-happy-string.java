import java.util.*;

class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sb = new StringBuilder();

        // Max heap: 가장 많이 남은 알파벳부터 꺼냄
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p2.count - p1.count);

        if (a > 0) pq.offer(new Pair('a', a));
        if (b > 0) pq.offer(new Pair('b', b));
        if (c > 0) pq.offer(new Pair('c', c));

        while (!pq.isEmpty()) {
            Pair first = pq.poll();

            int len = sb.length();
            // 같은 문자가 마지막 2개에 연속되어 있다면 → 두 번째로 많은 문자 선택
            if (len >= 2 && sb.charAt(len - 1) == first.ch && sb.charAt(len - 2) == first.ch) {
                if (pq.isEmpty()) break;

                Pair second = pq.poll();
                sb.append(second.ch);
                second.count--;

                if (second.count > 0) pq.offer(second);
                pq.offer(first); // 첫 번째 문자는 대기열로 다시 넣기
            } else {
                sb.append(first.ch);
                first.count--;

                if (first.count > 0) pq.offer(first);
            }
        }

        return sb.toString();
    }

    static class Pair {
        char ch;
        int count;

        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }
}
