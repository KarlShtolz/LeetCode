package org.example.solutions;
import org.example.solutions.utils.TreeNode;

/**
 * 530. Minimum Absolute Difference in BST
 * Given the root of a Binary Search Tree (BST), return the minimum absolute difference between the values of any two
 * different nodes in the tree.
 *
 * Example 1:
 * Input: root = [4,2,6,1,3]
 * Output: 1
 *
 * Example 2:
 * Input: root = [1,0,48,null,null,12,49]
 * Output: 1
 */
public class MinimumAbsoluteDifferenceInBST {
    int ans = Integer.MAX_VALUE;
    Integer prev = null;
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return ans;
    }
    private void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        if (prev != null) {
            ans = Math.min(ans, Math.abs(node.val - prev));
        }
        prev = node.val;
        inOrder(node.right);
    }
}
