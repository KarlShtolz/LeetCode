package org.example.solutions;

import org.example.solutions.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 257. Binary Tree Paths
 * Given the root of a binary tree, return all root-to-leaf paths in any order.
 * A leaf is a node with no children.
 *
 * Example 1:
 * Input: root = [1,2,3,null,5]
 * Output: ["1->2->5","1->3"]
 *
 * Example 2:
 * Input: root = [1]
 * Output: ["1"]
 */
public class BinaryTreePaths {
    List<String> answer = new ArrayList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root != null) searchBinaryTree(root, "");
        return answer;
    }
    public void searchBinaryTree (TreeNode root, String path) {
        if (root.left == null && root.right == null) answer.add(path + root.val);
        if (root.left != null) searchBinaryTree(root.left, path + root.val + "->");
        if (root.right != null) searchBinaryTree(root.right, path + root.val + "->");
    }
}
