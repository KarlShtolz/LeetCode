package org.example.solutions;

import org.example.solutions.utils.TreeNode;

/**
 * 101. Symmetric Tree
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 *
 * Example 1:
 * Input: root = [1,2,2,3,4,4,3]
 * Output: true
 *
 * Example 2:
 * Input: root = [1,2,2,null,3,null,3]
 * Output: false
 */

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }
    private boolean isSymmetric(TreeNode nodeLeft, TreeNode nodeRight) {
        if (nodeLeft == null && nodeRight == null) {
            return true;
        }
        if (nodeLeft == null || nodeRight == null) {
            return false;
        }
        return nodeLeft.val == nodeRight.val &&
                isSymmetric(nodeLeft.left, nodeRight.right) &&
                isSymmetric(nodeLeft.right, nodeRight.left);
    }
}
