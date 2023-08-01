package Completed.Tree.IsSameTree;

//Submission: https://leetcode.com/problems/same-tree/submissions/958778527/

public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) 
            return true;
        
        if (p == null || q == null) 
            return false;
        
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
      }
}
