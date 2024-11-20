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
    public TreeNode  srch(TreeNode node, int targetV) {
        if(node == null || node.val == targetV) {
            return node; // null 또는 일치하는 값을 반환
        }
        TreeNode next = node.val > targetV ? node.left : node.right;
        return srch(next, targetV);
    }
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode result = srch(root, val);
        return result;
    }
}