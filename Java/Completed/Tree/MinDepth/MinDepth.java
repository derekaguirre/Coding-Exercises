package Completed.Tree.MinDepth;

public class MinDepth {
    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(7, null, null);
        TreeNode node4 = new TreeNode(15, null, null);
        TreeNode node3 = new TreeNode(20, node4, node5);
        TreeNode node2 = new TreeNode(9, null, null);
        TreeNode root1 = new TreeNode(3, node2, node3);

        System.out.println(minDepthTwo(root1));
    }
    public static int minDepth(TreeNode root) {
        if(root == null)  return 0;
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        if(root.left == null && root.right == null)
            return 1;
        if(root.left == null)
            return 1 + rightDepth;
        if(root.right == null)
            return 1 + leftDepth;
        return Math.min(leftDepth, rightDepth) + 1;    // Adding 1 is the current node which is the parent of the two subtrees...
    }
    public static int minDepthTwo(TreeNode root) {
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
        
        return 1;
    }
}
