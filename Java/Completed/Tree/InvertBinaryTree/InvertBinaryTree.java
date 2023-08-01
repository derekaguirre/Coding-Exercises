package Completed.Tree.InvertBinaryTree;

//Submission: https://leetcode.com/problems/invert-binary-tree/submissions/981549244/

public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode node9 = new TreeNode(9, null, null);
        TreeNode node6 = new TreeNode(6, null, null);
        TreeNode node7 = new TreeNode(7, node6, node9);

        TreeNode node3 = new TreeNode(3, null, node6);
        TreeNode node1 = new TreeNode(1, null, null);
        TreeNode node2 = new TreeNode(2, node1, node3);

        TreeNode root = new TreeNode(4, node2, node7);

        invertTree(root);
    }

    
    public static TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;
        TreeNode tmpTree = root.left;
        root.left = root.right;
        root.right = tmpTree;
        // Once done at the root level, move to the child nodes
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
