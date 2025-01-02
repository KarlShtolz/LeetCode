package org.example.solutions;

import org.example.solutions.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 515. Find Largest Value in Each Tree Row
 * Given the root of a binary tree, return an array of the largest value in each row of the tree (0-indexed).
 *
 * Example 1:
 * Input: root = [1,3,2,5,3,null,9]
 * Output: [1,3,9]
 *
 * Example 2:
 * Input: root = [1,2,3]
 * Output: [1,3]
 */
public class FindLargestValueInEachTreeRow {
    private List<Integer> res;
    public List<Integer> largestValues(TreeNode root) {
        res = new ArrayList<>();
        dfs(root, 0);
        return res;
    }
    private void dfs(TreeNode root, int level) {
        if (root != null) {
            int val = root.val;
            if (res.size() == level) {
                res.add(val);
            } else {
                res.set(level, Math.max(res.get(level), val));
            }
            dfs(root.left, level + 1);
            dfs(root.right, level + 1);
        }
    }
}