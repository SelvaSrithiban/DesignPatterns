package trees.bst;

import javax.swing.tree.TreeNode;

    public class Search {

        public int solve(TreeNode A, int B) {
        if (A == null) {
            return 0;
        }

        if (A.val == B) {
            return 1;
        } else if (A.val > B) {
            return solve(A.left, B);
        } else {
            return solve(A.right, B);
        }
    }

}
