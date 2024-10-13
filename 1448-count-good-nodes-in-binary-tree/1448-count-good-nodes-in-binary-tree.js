/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var goodNodes = function (root) {
    count = 0

    const dfs = (node, max) => {
        if (!node) return;
        if (node.val >= max) count++;

        const maxNum = Math.max(node.val, max);
        dfs(node.left, maxNum);
        dfs(node.right, maxNum);
    };

    dfs(root, -1000000);
    return count;
};