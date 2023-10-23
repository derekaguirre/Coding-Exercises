package Completed.Tree.BreadthFirstSearch.TraversalLevelOrderII;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TraversalLevelOrderII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while (que.size() > 0) {
            int sz = que.size();
            List<Integer> temp = new ArrayList<>();
            while (sz-- > 0) {
                TreeNode rem = que.remove();
                temp.add(rem.val);
                if (rem.left != null) {
                    que.add(rem.left);
                }
                if (rem.right != null) {
                    que.add(rem.right);
                }
            }
            ans.add(0, temp);
        }
        return ans;
    }
}
