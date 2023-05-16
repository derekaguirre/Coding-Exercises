package Completed.TreePreOrderTraversal;
import java.util.ArrayList;
import java.util.List;


//Submission: https://leetcode.com/problems/n-ary-tree-preorder-traversal/submissions/951134407/

public class TreePreOrderTraversal {
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root == null)
            return list;
        list.add(root.val);
        for(Node i: root.children){
            preorder(i);
        }
        return list;
    }
}
