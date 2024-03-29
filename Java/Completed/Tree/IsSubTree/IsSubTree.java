package Completed.Tree.IsSubTree;

//Submission: https://leetcode.com/problems/subtree-of-another-tree/submissions/1111007471/

public class IsSubTree {
    public boolean isSubtree(TreeNode s, TreeNode t) { // takes O(m x n)
        // if (s == null)
        //     return t == null;
        if(t == null)
            return true;
        if(s == null)
            return false;

        return isSame(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    private boolean isSame(TreeNode t1, TreeNode t2) { // takes O(n)
        if (t1 == null && t2 == null)
            return true;
        if (t1 == null || t2 == null)
            return false;

        if (t1.val != t2.val)
            return false;
        return isSame(t1.left, t2.left) && isSame(t1.right, t2.right);
    }
}
