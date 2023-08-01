package Completed.Tree.FlattenTree;

//Submission: https://leetcode.com/problems/flatten-binary-tree-to-linked-list/submissions/981220599/

public class FlattenTree {
    public static void main(String[] args) {
        // TreeNode node6 = new TreeNode(6, null, null);
        // TreeNode node5 = new TreeNode(5, null, node6);
        // TreeNode node4 = new TreeNode(4, null, null);
        // TreeNode node3 = new TreeNode(3, null, null);
        // TreeNode node2 = new TreeNode(2, node3, node4);
        // TreeNode node1 = new TreeNode(1, node2, node5);

        // flatten(node1);
    }

    private TreeNode newTree = null;
    public void flatten(TreeNode root) {
        if(root == null)
            return;
        // Rlr
        flatten(root.right);
        flatten(root.left);
        root.right = newTree;
        root.left =null;
        
        newTree = root;
    }
}
