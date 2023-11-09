package Completed.Tree.BalancedBinaryTree;

//Submission: https://leetcode.com/problems/balanced-binary-tree/submissions/1088156320/

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return isBalancedAndHeight(root) >= 0;
    }

    public int isBalancedAndHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = isBalancedAndHeight(root.left);
        if (left < 0)
            return left;
        int right = isBalancedAndHeight(root.right);
        if (right < 0)
            return right;

        if (Math.abs(left - right) > 1)
            return -Math.abs(left - right);

        return Math.max(left, right) + 1;
    }
}
