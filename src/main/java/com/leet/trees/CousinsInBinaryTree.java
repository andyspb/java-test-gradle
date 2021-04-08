package com.leet.trees;

// In a binary tree, the root node is at depth 0, and children of each depth k node are at depth
// k+1.
// Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
// We are given the root of a binary tree with unique values, and the values x and y of two
// different nodes in the tree.
// Return true if and only if the nodes corresponding to the values x and y are cousins.

// Constraints:
// The number of nodes in the tree will be between 2 and 100.
// Each node has a unique integer value from 1 to 100.

import java.util.HashMap;
import java.util.Map;

public class CousinsInBinaryTree {
  Map<Integer, Integer> depth;
  Map<Integer, TreeNode> parent;

  public boolean isCousins(TreeNode root, int x, int y) {

    depth = new HashMap();
    parent = new HashMap();
    dfs(root, null);
    return (depth.get(x) == depth.get(y) && parent.get(x) != parent.get(y));
  }

  public void dfs(TreeNode node, TreeNode par) {
    if (node != null) {
      depth.put(node.val, par != null ? 1 + depth.get(par.val) : 0);
      parent.put(node.val, par);
      dfs(node.left, node);
      dfs(node.right, node);
    }
  }

  public static void main(String[] args) {

    TreeNode tn1 = new TreeNode(1);
    TreeNode tn2 = new TreeNode(2);
    TreeNode tn3 = new TreeNode(3);
    TreeNode tn4 = new TreeNode(4);
    TreeNode tn5 = new TreeNode(5);

    tn1.left = tn2;
    tn1.right = tn3;
    tn2.right = tn4;
    tn3.right = tn5;
    CousinsInBinaryTree cbt = new CousinsInBinaryTree();
    boolean res = cbt.isCousins(tn1, 4, 5);

    System.out.println(res);
  }
}
