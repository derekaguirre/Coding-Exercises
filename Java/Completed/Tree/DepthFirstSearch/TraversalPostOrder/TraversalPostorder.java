package Completed.Tree.DepthFirstSearch.TraversalPostOrder;

import java.util.ArrayList;
import java.util.List;

//Submission: https://leetcode.com/problems/binary-tree-postorder-traversal/submissions/1078709021/

public class TraversalPostorder {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        helper(root, list);
        return list;
    }

    // Pre-order: Root left right
    // In-order: left Root right
    // Post-order: left right Root
    public List<Integer> helper(TreeNode root, List<Integer> list) {
        if (root == null)
            return list;

        helper(root.left, list);
        helper(root.right, list);
        list.add(root.val);
        return list;
    }
}
