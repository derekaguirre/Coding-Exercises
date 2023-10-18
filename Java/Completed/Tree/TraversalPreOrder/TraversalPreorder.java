package Completed.Tree.TraversalPreOrder;

import java.util.ArrayList;
import java.util.List;

//Submission: https://leetcode.com/problems/binary-tree-preorder-traversal/submissions/1078705201/

public class TraversalPreorder {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        helper(root, list);
        return list;
    }
    public List<Integer> helper(TreeNode root, List<Integer> list) {
        if(root == null)
            return list;

        list.add(root.val);
        helper(root.left,list);
        helper(root.right,list);

        return list;
    }
}
