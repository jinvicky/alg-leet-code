/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
       // 1. Base Case 1: 두 노드 모두 null이면 동일함
        if (p == null && q == null) {
            return true;
        }

        // 2. Base Case 2: 둘 중 하나만 null이면 동일하지 않음 (위에서 둘 다 null인 경우는 걸러짐)
        if (p == null || q == null) {
            return false;
        }

        // 3. Current Node Comparison: 두 노드 모두 null이 아닌데, 값이 다르면 동일하지 않음
        if (p.val != q.val) {
            return false;
        }

        // 4. Recursive Step: 현재 노드까지는 같으니, 이제 왼쪽 서브트리와 오른쪽 서브트리가 각각 동일한지 재귀적으로 확인
        //    두 재귀 호출 결과가 모두 true여야만 최종적으로 true 반환
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}