package trees;

public class InversionOfTree {

    public TreeNode invertTree(TreeNode A) {

        //base case
        if(A == null){
            return A;
        }

        //assumptions
        //invert left and right
        TreeNode right = invertTree(A.left);
        TreeNode left = invertTree(A.right);

        //Assign them
        A.right = right;
        A.left = left;

        return A;
    }

}
