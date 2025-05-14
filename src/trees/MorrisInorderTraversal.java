package trees;

import java.util.ArrayList;

public class MorrisInorderTraversal {

    public ArrayList<Integer> solve(TreeNode A) {

        //check null
        if(A == null){
            return new ArrayList<>();
        }
        ArrayList<Integer> ans = new ArrayList<>();

        TreeNode curr = A;
        //TreeNode pred = null;

        //Traverse through the tree
        while(curr != null){
            // If no left child, visit this node and move to right
            if(curr.left == null){
                ans.add(curr.val);
                //move right
                curr = curr.right;
            }else{
                // Find the inorder predecessor of current
                TreeNode pred = curr.left;
                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }

                if (pred.right == null) {
                    // Make current as right child of its inorder predecessor
                    pred.right = curr;
                    curr = curr.left;
                } else {
                    // Revert the changes made (i.e., fix the right child of predecessor)
                    pred.right = null;
                    ans.add(curr.val);
                    curr = curr.right;
                }
            }
        }

        return ans;
    }

}
