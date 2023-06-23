package Progress.FlattenTree;

//Problem: https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/

public class FlattenTree {
    public static void main(String[] args) {
        TreeNode node6 = new TreeNode(6, null, null);
        TreeNode node5 = new TreeNode(5, null, node6);
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, node3, node4);
        TreeNode node1 = new TreeNode(1, node2, node5);

        flatten(node1);
    }

    TreeNode prev = new TreeNode();
    public static void flatten(TreeNode root) {
        if (root == null)
            return;

        flatten(root.right);
        flatten(root.left);

        
    }
}
