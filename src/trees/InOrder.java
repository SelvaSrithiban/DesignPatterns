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

public class InOrder {

    public ArrayList<Integer> traversal(TreeNode A, ArrayList<Integer> ans){

        //check null
        if(A == null){
            return ans;
        }

        //Traverse through the left TreeNode
        traversal(A.left, ans);
        //Add the root node to ans
        ans.add(A.val);
        //Traverse through the right TreeNode
        traversal(A.right, ans);

        return ans;
    }
    public ArrayList<Integer> inorderTraversal(TreeNode A) {

        ArrayList<Integer> ans = new ArrayList<>();
        traversal(A, ans);

        return ans;
    }

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

        InOrder po = new InOrder();
        ArrayList<Integer> result = po.inorderTraversal(root);

        System.out.println("InOrder Traversal: " + result);
    }

}
