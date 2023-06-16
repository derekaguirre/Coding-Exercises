package Completed.MaxDepthBinaryTree;

public class MaxDepthBinaryTree{

    public static void main(String[] args) {
    }


    //BFS
    //LevelOrder

    //DFS
    //Preorder  Rlr
    //Inorder   lRr
    //Postorder lrR

    //Recursive Depth First Search
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        
        return Math.max(maxDepth(root.left) + 1, (maxDepth(root.right) + 1));
    }

    //Iterative DFS



    //Iterative BFS
    
    
}