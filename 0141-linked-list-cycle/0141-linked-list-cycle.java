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
        HashSet<ListNode> set = new HashSet<>();

        if (head == null || head.next == null)
            return false;

        ListNode fast = head;

        while (fast != null) {
            if(!set.add(fast)) {
                return true;
            }
            // 노드 업데이트 
            fast = fast.next;
        }
        return false;
    }
}