package Completed.Tree.PathSum;

//Submission: https://leetcode.com/problems/path-sum/submissions/958050335/

public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        // recursion method
        if (root == null)
            return false;
        if (root.left == null && root.right == null && root.val == sum)
            return true;
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
