package trees;

public class Search {

    public int solve(TreeNode A, int B) {
        if (A == null) {
            return 0;
        }
    
        if (A.val == B) {
            return 1;
        }
    
        // Explore both subtrees
        int leftResult = solve(A.left, B);
        int rightResult = solve(A.right, B);
    
        return (leftResult == 1 || rightResult == 1) ? 1 : 0;
    }

}
