/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {

    private int maxDp = 0;

    public void calculate(TreeNode node, int dp) {
        if(node == null) {
            return;
        }
        dp+=1;
        this.maxDp = Math.max(dp, maxDp);

        System.out.println(maxDp+ " and " + node.val);
        calculate(node.left, dp);
        calculate(node.right, dp);
    }

    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        }
        calculate(root, 0);
        return maxDp;
    }
}