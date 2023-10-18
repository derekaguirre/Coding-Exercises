package Completed.Tree.BreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Submission: https://leetcode.com/problems/binary-tree-level-order-traversal/submissions/1078718848/

public class TraversalLevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        // Start the process by adding the root
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            // Hold all node values
            List<Integer> currentLevel = new ArrayList<>();
            // Iterate through queue
            for (int i = 0; i < size; i++) {
                // Get the current tree node that needs to be processed
                TreeNode current = queue.remove();
                // Add that node to the "current level" list
                currentLevel.add(current.val);
                // Check if the current node has any children so that the queue will process
                // them on the next iteration
                if (current.left != null)
                    queue.add(current.left);
                if (current.right != null)
                    queue.add(current.right);
            }
            // When done processing the current level, add to the list of lists (result)
            result.add(currentLevel);
        }
        return result;
    }
}
