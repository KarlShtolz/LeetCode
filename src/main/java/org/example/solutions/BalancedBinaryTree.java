package org.example.solutions;

import org.example.solutions.utils.TreeNode;

/**
 * 110. Balanced Binary Tree
 * Given a binary tree, determine if it is
 * height-balanced.
 *
 * Example 1:
 * Input: root = [3,9,20,null,null,15,7]
 * Output: true
 *
 * Example 2:
 * Input: root = [1,2,2,3,3,null,null,4,4]
 * Output: false
 *
 * Example 3:
 * Input: root = []
 * Output: true
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return isBalancedUtils(root) >= 0;
    }

    public int isBalancedUtils(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = isBalancedUtils(root.left);
        if (l < 0) {
            return l;
        }
        int r = isBalancedUtils(root.right);
        if (r < 0) {
            return r;
        }
        if (Math.abs(l-r) > 1) {
            return -Math.abs(l-r);
        }
        return Math.max(l, r) + 1;
    }
}
