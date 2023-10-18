package Completed.Tree.BreadthFirstSearch.TraversalZigZagLevelOrder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

//Submission: https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/submissions/1078743050/

public class TraversalZigZagLevelOrder {
    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(7, null, null);
        TreeNode node4 = new TreeNode(15, null, null);
        TreeNode node3 = new TreeNode(20, node4, node5);
        TreeNode node2 = new TreeNode(9, null, null);
        TreeNode node1 = new TreeNode(3, node2, node3);
        zigzagLevelOrder(node1);
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean reverseTraversal = false;

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<Integer>();
            Stack<Integer> stack = new Stack<Integer>();

            for (int i = 0; i < size; i++) {
                TreeNode currentNode = queue.remove();

                // Populate currentLevel list depending on reverse flag
                if (reverseTraversal)
                    stack.add(currentNode.val);
                else
                    currentLevel.add(currentNode.val);

                // Populate the next iteration with the children of current node
                if (currentNode.left != null)
                    queue.add(currentNode.left);
                if (currentNode.right != null)
                    queue.add(currentNode.right);

            }
            // Flip the flag for further iterations
            reverseTraversal = !reverseTraversal;

            while (!stack.isEmpty())
                currentLevel.add(stack.pop());

            result.add(currentLevel);
        }

        return result;
    }
}
