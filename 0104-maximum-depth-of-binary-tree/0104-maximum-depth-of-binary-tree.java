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

    public int maxDepth(TreeNode root) {
        /**
            root가 널값이면 0을 반환한다. 
            재귀를 left, right 방향으로 호출하고, return 0일 때 기존 재귀값들을 모두 더함 + 1을 반환한다. 
         */

         if(root==null) return 0;
         return 1+ Math.max(maxDepth(root.left), maxDepth(root.right));
    }


}