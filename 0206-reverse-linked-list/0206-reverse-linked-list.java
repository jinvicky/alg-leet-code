class Solution {
    public ListNode reverseList(ListNode head) {
    if (head == null) return null;

    Stack<ListNode> stack = new Stack<>();
    while (head != null) {
        stack.push(head);
        head = head.next;
    }

    ListNode newHead = stack.pop();
    ListNode current = newHead;

    while (!stack.isEmpty()) {
        ListNode temp = stack.pop();
        current.next = temp;
        current = current.next; // ← 수정: 자기 자신 가리키는 대신 앞으로 이동
    }

    current.next = null; // 마지막 tail 정리
    return newHead;
}

}