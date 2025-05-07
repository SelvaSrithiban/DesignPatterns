package trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class LevelOrderTraversal {

    public ArrayList<ArrayList<Integer>> solve(TreeNode A) {
        
        //check null
        if(A == null){
            return new ArrayList<>();
        }

       
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        //Insert the root into the queue
        q.add(A);

        while (!q.isEmpty()) {
        int n = q.size();
        ArrayList<Integer> level = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            //remove the node from the queue
            TreeNode tmp = q.poll();
            //add the value to list
            level.add(tmp.val);
            //add the left node to the queue
            if (tmp.left != null) {
                q.add(tmp.left);
            }
            //add the right node to the queue
            if (tmp.right != null) {
                q.add(tmp.right);
            }
        }

        ans.add(level);
        }
        return ans;
    }

}
