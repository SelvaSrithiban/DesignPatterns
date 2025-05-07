package trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class LeftView {

    public ArrayList<Integer> solve(TreeNode A) {

        //check null
        if(A == null){
            return new ArrayList<>();
        }
        //Create ans ArrayList
        ArrayList<Integer> ans = new ArrayList<>();
        //create a queue and add the root element
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(A);

        //Traverse now
        while(!q.isEmpty()){
            int n = q.size();

            for(int i = 0; i < n; i++){
                //pop the peek TreeNode
                TreeNode tmp = q.poll();
                //add it to the ans
                if(i == 0){
                ans.add(tmp.val);
                }
                //add the left subtree
                if(tmp.left != null){
                    q.add(tmp.left);
                }
                //add the right subtree
                if(tmp.right != null){
                    q.add(tmp.right);
                }
                
            }
        }
        return ans;
    }

}
