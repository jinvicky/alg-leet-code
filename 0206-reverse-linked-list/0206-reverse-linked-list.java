/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        return processNext(head, null);
    }

    public ListNode processNext(ListNode currentNode, ListNode prevNode) {
        if (currentNode == null) {
            return prevNode; // 역순 리스트의 새로운 머리 반환
        }

        ListNode nextNode = currentNode.next; // 다음 노드를 저장
        currentNode.next = prevNode; // 현재 노드의 next를 이전 노드로 설정

        return processNext(nextNode, currentNode); // 재귀 호출
    }
}
