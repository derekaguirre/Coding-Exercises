package Completed.Tree.DepthFirstSearch.TraversalInOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//Submission: https://leetcode.com/problems/binary-tree-inorder-traversal/submissions/980374214/
//Submission2: https://leetcode.com/problems/binary-tree-inorder-traversal/submissions/1088140759/

public class BinaryTreeInOrder {
    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, node3, null);
        TreeNode root = new TreeNode(1, null, node2);

        inOrderIter(root);
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        helper(root, list);
        return list;
    }

    // Helper method to ensure that the root can be added to a list while
    // maintaining the arg constraints on parent method
    public static List<Integer> helper(TreeNode root, List<Integer> res) {
        if (root == null)
            return res;

        helper(root.left, res);
        res.add(root.val);
        helper(root.right, res);

        return res;
    }

    public static List<Integer> inOrderIter(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> result = new ArrayList<Integer>();
        TreeNode current = root;
        while (current != null || stack.size() > 0) {
            while(current!= null){
                stack.add(current);
                current = current.left;
            }
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }
        return result;
    }
}
