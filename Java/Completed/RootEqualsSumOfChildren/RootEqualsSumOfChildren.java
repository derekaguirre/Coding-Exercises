package Completed.RootEqualsSumOfChildren;

//Submission: https://leetcode.com/problems/root-equals-sum-of-children/submissions/956102987/

public class RootEqualsSumOfChildren{
    public boolean checkTree(TreeNode root) {
        if(root.val == root.left.val + root.right.val)
            return true;
        else
            return false;
    }
}