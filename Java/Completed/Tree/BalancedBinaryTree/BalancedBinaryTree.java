package Completed.Tree.BalancedBinaryTree;

//Submission: https://leetcode.com/problems/balanced-binary-tree/submissions/1088156320/

public class BalancedBinaryTree {
    public static void main(String[] args) {
        // TreeNode node7 = new TreeNode(7, null, null);
        // TreeNode node6 = new TreeNode(7, null, node7);

        TreeNode node5 = new TreeNode(7, null, null);
        TreeNode node4 = new TreeNode(15, null, null);

        TreeNode node3 = new TreeNode(20, node4, node5);
        TreeNode node2 = new TreeNode(9, null, null);
        
        TreeNode node1 = new TreeNode(3, node2, node3);

        System.out.println(isBalanced2(node1));
    }

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

    public static boolean isBalanced2(TreeNode root) {
        if (root == null)
            return true;
        //Get max height of respective sides
        int leftMax = maxHeight(root.left);
        int rightMax = maxHeight(root.right);

        //Subtract both maxes to check if balanced
        if (Math.abs(leftMax - rightMax) > 1)
            return false;
        
        //Recursively check subtrees on both sides
        boolean balanceLeft = isBalanced2(root.left);
        boolean balanceRight = isBalanced2(root.right);
        
        //If both are true then the entire tree is balanced
        return balanceLeft && balanceRight;
    }

    public static int maxHeight(TreeNode root) {
        if (root == null)
            return 0;
        int l = maxHeight(root.left);
        int r = maxHeight(root.right);
        return 1 + Math.max(l, r);
    }
}
