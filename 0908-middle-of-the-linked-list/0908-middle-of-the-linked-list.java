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
    public ListNode middleNode(ListNode head) {
        int flag = 0; // 1일 때만 slow = ?.next;
        ListNode slow = null;
        ListNode fast = null;

        fast = head;
        slow = head;

        while (fast != null && fast.next != null) {
            if (flag % 2 == 0) {
                slow=slow.next;
            } else {
            }
            flag++;
            fast = fast.next;
        }
        return slow;
    }
}