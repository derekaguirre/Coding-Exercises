package Completed.Tree.CountNodesEqualToAverageOfSubtree;

//Submission: https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/submissions/1090916291/

public class CountNodesEqualToAverageOfSubtree {
    public int averageOfSubtree(TreeNode root) {
        int[] result = new int[1];
        helper(root, result);
        return result[0];
    }

    private int[] helper(TreeNode node, int[] result) {
        if (node == null) return new int[]{0, 0};
        
        int[] left = helper(node.left, result);
        int[] right = helper(node.right, result);
        
        int currSum = node.val + left[0] + right[0];
        int currCount = 1 + left[1] + right[1];
        
        if (currSum / currCount == node.val) result[0]++;
        
        return new int[]{currSum, currCount};
    }
}
