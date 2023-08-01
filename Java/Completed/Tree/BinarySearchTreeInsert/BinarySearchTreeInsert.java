package Completed.Tree.BinarySearchTreeInsert;

//Submission: https://leetcode.com/problems/insert-into-a-binary-search-tree/submissions/984264346/

public class BinarySearchTreeInsert {
    public TreeNode insertIntoBST(TreeNode root, int val){
        if(root == null)
            return new TreeNode(val);
        if(val > root.val)
            root.right = insertIntoBST(root.right, val);
        else
            root.left = insertIntoBST(root.left, val);
        return root;
    }
}
