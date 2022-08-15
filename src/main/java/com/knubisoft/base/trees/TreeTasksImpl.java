package com.knubisoft.base.trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TreeTasksImpl implements TreeTasks {

    @Override
    public boolean isSameTree(TreeNode node1, TreeNode node2) {
        return node1.equals(node2);
    }

    @Override
    public List<Integer> inorderTraversal(TreeNode node) {
        List<Integer> result = new ArrayList<>();
        if (node.left == null) {
            result.add(node.val);
            if (node.right != null) {
                result.addAll(inorderTraversal(node.right));
            }
            return result;
        }
        result.addAll(inorderTraversal(node.left));
        result.add(node.val);
        if (node.right != null) {
            result.addAll(inorderTraversal(node.right));
        }
        return result;
    }

    @Override
    public boolean isSymmetric(TreeNode node) {
        if (node != null) {
            List<Integer> tree = inorderTraversal(node);
            if (tree.size() % 2 == 0) return false;
            List<Integer> reversedPart = tree.subList(tree.size() / 2 + 1, tree.size());
            Collections.reverse(reversedPart);
            return tree.subList(0, tree.size() / 2).equals(reversedPart);
        }
        return false;
    }

    @Override
    public int maxDepth(TreeNode node) {
        int count = 1;
        int countLeft = 0;
        int countRight = 0;
        if (node.left != null) {
            countLeft = maxDepth(node.left);
        }
        if (node.right != null) {
            countRight = maxDepth(node.right);
        }
        return count + (Math.max(countLeft, countRight)) ;
    }

    @Override
    public boolean hasPathSum(TreeNode node, int targetSum) {
        boolean leftPath = false, rightPath = false, curNode = false;
        if (node != null) {
            if (node.right == null && node.left == null)
                curNode = targetSum == node.val;
            if (node.left != null)
                leftPath = hasPathSum(node.left, targetSum - node.val);
            if (node.right != null)
                rightPath = hasPathSum(node.right, targetSum - node.val);
        }
        return curNode || leftPath || rightPath;
    }

    @Override
    public TreeNode invertTree(TreeNode node) {
        if (node.left != null) {
            node.left = invertTree(node.left);
        }
        if (node.right != null) {
            node.right = invertTree(node.right);
        }
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        return node;
    }

    @Override
    public int sumOfLeftLeaves(TreeNode node) {
        int a = 0, b = 0;
        if (node != null) {
            if (node.left != null)
                a = node.left.left == null && node.left.right == null ? node.left.val : sumOfLeftLeaves(node.left);
            if (node.right != null)
                b = sumOfLeftLeaves(node.right);
        }
        return a + b;
    }

    @Override
    public TreeNode mergeTrees(TreeNode node1, TreeNode node2) {
        if (node2 != null) {
            if (node1 != null) {
                node1.val += node2.val;
                node1.left = mergeTrees(node1.left, node2.left);
                node1.right = mergeTrees(node1.right, node2.right);
            } else node1 = node2;
        }
        return node1;
    }
}
