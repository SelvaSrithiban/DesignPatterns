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

public class PreOrder {
    public ArrayList<Integer> traversal(TreeNode A, ArrayList<Integer> ans) {
        if (A == null) {
            return ans;
        }

        ans.add(A.val);
        traversal(A.left, ans);
        traversal(A.right, ans);

        return ans;
    }

    public ArrayList<Integer> preorderTraversal(TreeNode A) {
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

        PreOrder po = new PreOrder();
        ArrayList<Integer> result = po.preorderTraversal(root);

        System.out.println("Preorder Traversal: " + result);
    }

}
