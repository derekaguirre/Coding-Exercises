package Completed.BinaryTreeCousins;

//Submission: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/submissions/982699374/

public class BinaryTreeCousins {
    TreeNode xParent;
    TreeNode yParent;
    int depthX = 0;
    int depthY = 0;

    public boolean isCousins(TreeNode root, int x, int y) {
        helper(root, x, y, 0, null);
        if(depthX == depthY && xParent != yParent)
            return true;
        return false;
    }
    private void helper(TreeNode root, int x, int y, int height, TreeNode prev){
        if(root == null)
            return;
        if(root.val == x){
            xParent = prev;
            depthX = height;
        }
        if(root.val == y){
            yParent = prev;
            depthY = height;
        }
        prev = root;
        helper(root.left, x, y, height+1, prev);
        helper(root.right, x, y, height+1, prev);
    }
}
