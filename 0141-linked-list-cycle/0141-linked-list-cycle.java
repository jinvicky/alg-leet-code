/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        /**
            hasSet으로 중복 노드를 체크한다. head가 널일때까지
         */
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if(!set.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}