package Completed.MaxDepthBinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MaxDepthBinaryTree {

    // Recursive Depth First Search
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        return Math.max(maxDepth(root.left) + 1, (maxDepth(root.right) + 1));
    }

    // Iterative DFS Preorder
    public int maxDepthIter(TreeNode root) {
        if(root == null)
            return 0;
        Stack<TreeNode> stack = new Stack<>();
        int depth = 1;
        stack.push(root);
        //Rlr
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();

            if(node != null){
                 node = max(st)
            }
        }

        
        return 0;
    }

    // Iterative BFS (Level Order)
    public int maxDepthBFS(TreeNode root) {
        if (root == null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                TreeNode node = queue.poll();
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            level++;
        }
        return level;
    }

}
