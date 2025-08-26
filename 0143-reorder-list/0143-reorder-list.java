class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // 1) 모든 노드를 스택에 쌓고 길이 n 계산
        Stack<ListNode> st = new Stack<>();
        int n = 0;
        for (ListNode p = head; p != null; p = p.next) {
            st.push(p);
            n++;
        }

        // 2) 앞에서부터 n/2 번 교차 연결
        ListNode cur = head;
        for (int i = 0; i < n / 2; i++) {
            ListNode tail = st.pop();   // 뒤에서 i번째 노드
            ListNode next = cur.next;   // 덮어쓰기 전에 백업

            // cur 다음에 tail을 꽂고, tail 다음에 next 연결
            cur.next = tail;
            tail.next = next;

            // 다음 교차 지점으로 이동
            cur = next;
        }

        // 3) 사이클 방지: 홀수/짝수 모두 여기서 단일 연결리스트 보장
        if (cur != null) cur.next = null;
    }
}
