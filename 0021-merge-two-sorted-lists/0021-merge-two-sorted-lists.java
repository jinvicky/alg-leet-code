class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode answer = new ListNode();
        ListNode mergePointer = answer;

        while (list1 != null && list2 != null) {
            // list1의 값이 list2의 값보다 작거나 같으면 list1의 노드를 병합
            if (list1.val <= list2.val) { // <-- 수정된 부분
                mergePointer.next = list1;
                list1 = list1.next;
            } else {
                // 그렇지 않으면 list2의 노드를 병합
                mergePointer.next = list2;
                list2 = list2.next;
            }
            mergePointer = mergePointer.next;
        }

        // 남은 노드들을 모두 병합
        if (list1 != null) {
            mergePointer.next = list1;
        } else {
            mergePointer.next = list2;
        }

        return answer.next;
    }
}