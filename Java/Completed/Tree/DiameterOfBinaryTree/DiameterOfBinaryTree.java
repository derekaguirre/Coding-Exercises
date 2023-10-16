package Completed.Tree.DiameterOfBinaryTree;

//Submission: https://leetcode.com/problems/diameter-of-binary-tree/submissions/1074703790/

public class DiameterOfBinaryTree {
    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(5, null, null);
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node1 = new TreeNode(1, node2, node3);

        System.out.println(diameterOfBinaryTree(node1));
    }

    static int ans = 0;

    public static int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        System.out.println("Calling helper on node:" + root.val);
        height(root);
        return ans;
    }

    public static int height(TreeNode root) {
        // if root==null height==0
        if (root == null)
            return -1;
        System.out.println("Inside helper on node:" + root.val);
        int L = height(root.left);
        int R = height(root.right);
        // ans signfies(no. of nodes farthest apart) or the DIAMETER
        ans = Math.max(ans, L + R + 2);
        // height of the tree is max of LST & RST +1
        return 1 + Math.max(L, R);
    }
}
