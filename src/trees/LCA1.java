package trees;

import trees.bst.TreeNode;

public class LCA1 {

    public static TreeNode LCA(TreeNode root, int val1, int val2) {
        if (root == null)
            return null;
        if (root.val == val1 || root.val == val2)
            return root;
        TreeNode l = LCA(root.left, val1, val2);
        TreeNode r = LCA(root.right, val1, val2);
        if (l != null && r != null)
            return root;
        if (l != null)
            return l;
        return r;
    }
    public static boolean find(TreeNode root, int val1) {
        if (root == null)
            return false;
        if (root.val == val1)
            return true;
        return (find(root.left, val1) || find(root.right, val1));
    }
    public int lca(TreeNode A, int B, int C) {
        int val1 = B;
        int val2 = C;
        TreeNode root = A;
        if (find(root, val1) == false || find(root, val2) == false) 
            return -1;
        TreeNode ans = LCA(root, val1, val2);
        if (ans == null) 
            return -1;
        return ans.val;
    }

}
