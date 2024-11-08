/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
   public int pairSum(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        Stack<Integer> stack = new Stack<>();

        while(slow != null) {
            stack.push(slow.val);
            slow = slow.next;
        }

        int max = 0;
        ListNode node = head;

        while(!stack.isEmpty()) {
            int cal = stack.pop() + node.val;

            max = Math.max(max, cal);

            node= node.next;
        }
        return max;
    }
}