package Completed.Tree.InvertBinaryTree;

//Submission: https://leetcode.com/problems/invert-binary-tree/submissions/981549244/
//Submission 2: https://leetcode.com/problems/invert-binary-tree/submissions/1074653517
//Submission 3: https://leetcode.com/problems/invert-binary-tree/submissions/1169646748

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
        //Swap children of the root
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        //Invert left tree, then the right
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public static TreeNode invertTree2(TreeNode root) {
        if(root == null){
            return root;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public static TreeNode invertTree3(TreeNode root){
        if(root == null)
            return root;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertTree3(root.left);
        invertTree3(root.right);
        return root;
    }
}
