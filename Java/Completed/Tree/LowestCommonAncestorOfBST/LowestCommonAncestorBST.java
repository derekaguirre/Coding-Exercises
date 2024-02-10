package Completed.Tree.LowestCommonAncestorOfBST;

public class LowestCommonAncestorBST {
    public static void main(String[] args) {
        TreeNode node8 = new TreeNode(5, null, null);
        TreeNode node7 = new TreeNode(3, null, null);

        TreeNode node6 = new TreeNode(9, null, null);
        TreeNode node5 = new TreeNode(7, null, null);
        TreeNode node4 = new TreeNode(4, node7, node8);
        TreeNode node3 = new TreeNode(0, null, null);

        TreeNode node2 = new TreeNode(8, node5, node6);
        TreeNode node1 = new TreeNode(2, node3, node4);

        TreeNode root = new TreeNode(6, node1, node2);
        lowestCommonAncestor(root, node1, node4);
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return root;
        // If both values are greater than the root keep moving right
        if (p.val > root.val && q.val > root.val)
            return lowestCommonAncestor(root.right, p, q);
        // If both values are lower than the root keep moving left
        else if (p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left, p, q);
        // Return the root since it is in between the p and the q
        // IFF one of the values is >= root or <= root
        else
            return root;
    }

}
