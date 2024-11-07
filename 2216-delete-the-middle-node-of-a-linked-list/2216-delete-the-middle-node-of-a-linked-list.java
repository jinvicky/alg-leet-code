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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) {
            return null;
        }
        // ListNode fast = head;
        // ListNode slow = head;
        // ListNode prev = head;
        // int flag = 0;


        // while(fast != null && fast.next != null) {
        //     if(flag%2==0) {
        //         slow=slow.next;
        //     }else if(flag%3 !=0){
        //         prev=prev.next;
        //     }
        //     fast=fast.next;
        //     flag++;
        // }

           ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;  // prev를 null로 초기화
        
        while (fast != null && fast.next != null) {
            fast = fast.next.next;  // fast는 두 칸씩 이동
            prev = slow;            // prev는 slow의 이전 노드를 가리킴
            slow = slow.next;       // slow는 한 칸씩 이동
        }
        
        // 여기서 slow가 가리키는 노드를 삭제
        if (prev != null) {
            prev.next = slow.next;  // prev의 다음을 slow의 다음으로 연결
        }
        
        System.out.println("1. "+prev.val);
        System.out.println(slow.val);
        // 이제 slow가 가리키는 노드를 remove 
        prev.next=slow.next;
        return head;   
    }
}