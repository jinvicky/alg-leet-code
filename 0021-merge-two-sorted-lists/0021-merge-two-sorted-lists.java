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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        /**
            결과값을 반환할 answer 노드와 머지를 진행할 dummy 노드, 총 2개의 노드가 필요하다.
            오름차순 정렬인 것을 보아, 더 값이 작은 노드를 비교 후 추가해야 한다. 
        
            두 노드의 길이가 다르다면? -> 같을때까지만 하고 나머지는 그냥 다 붙여야겠는데?
            왜냐하면 조건이 두 리스트는 각각은 "오름차순" 정렬되어 있거든.
         */

        ListNode answer = new ListNode();
        ListNode dummy = answer;

        while(list1 != null && list2 != null) { // 두 노드가 모두 널이 아닐때까지
            // 값을 비교한다. 
            if (list1.val > list2.val) {
                dummy.next = list2;
                list2 = list2.next;
            } else {
                dummy.next = list1;
                list1 = list1.next;
            }
            dummy = dummy.next;
        }

        // 둘중에 널이 아닌 노드를 dummy의 다음에 연결한다. 
        dummy.next = (list1 != null) ? list1 : list2;

        return answer.next;
    }
}