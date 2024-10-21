package Completed.Tree.InOrderArrange;


//Submission: https://leetcode.com/problems/increasing-order-search-tree/submissions/1429791230

public class InOrderArrange {
    TreeNode newRoot = null;
    public TreeNode increasingBST(TreeNode root) {
        helper(root);
        return newRoot;
    }

    public void helper(TreeNode root){
        if(root == null){
            return;
        }
        helper(root.right);
        newRoot = new TreeNode(root.val, null, newRoot);
        helper(root.left);
    }
}
