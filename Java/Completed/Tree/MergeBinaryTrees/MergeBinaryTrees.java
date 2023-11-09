package Completed.Tree.MergeBinaryTrees;

//Submission: https://leetcode.com/problems/merge-two-binary-trees/submissions/1090288367/

public class MergeBinaryTrees {
    public static void main(String[] args) {
        TreeNode node25 = new TreeNode(7, null, null);
        TreeNode node24 = new TreeNode(4, null, null);
        TreeNode node23 = new TreeNode(3, null, node25);
        TreeNode node22 = new TreeNode(1, null, node24);
        TreeNode root2 = new TreeNode(2, node22, node23);

        TreeNode node14 = new TreeNode(5, null, null);
        TreeNode node13 = new TreeNode(2, null, null);
        TreeNode node12 = new TreeNode(3, node14, null);
        TreeNode root1 = new TreeNode(1, node12, node13);

        mergeTrees(root1, root2);
    }

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
            return null;
        if (root1 == null)
            return root2;
        if (root2 == null)
            return root1;

        root1.val = root1.val + root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        return root1;
    }
}
