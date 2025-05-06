package trees;

import java.util.ArrayList;


class TreeNode {
    int val;
   TreeNode left;
    TreeNode right;
    TreeNode(int x) {
     val = x;
     left=null;
     right=null;
    }
}

public class PostOrder {

    public ArrayList<Integer> traversal(TreeNode A, ArrayList<Integer> ans){

        //check null
        if(A == null){
            return ans;
        }

        //Traverse through the left nodes
        traversal(A.left, ans);
        //Traverse through the right nodes
        traversal(A.right, ans);
        //add the root node to the ans
        ans.add(A.val);

        return ans;
    }

    
    public ArrayList<Integer> postorderTraversal(TreeNode A) {

        ArrayList<Integer> ans = new ArrayList<>();
        traversal(A, ans);

        return ans;
    }

     // Main method for testing
     public static void main(String[] args) {
        // Build a sample binary tree:
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        PostOrder po = new PostOrder();
        ArrayList<Integer> result = po.postorderTraversal(root);

        System.out.println("Postorder Traversal: " + result);
    }

}
