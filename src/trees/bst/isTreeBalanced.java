package trees.bst;

public class isTreeBalanced {

    public int rec(TreeNode A, long min, long max){

        if(A == null){
            return 1;
        }

        //check if the curr node is less than left and greater than right
        if(min < A.val && A.val < max){
            //check the left subtree
            int l = rec(A.left, min, A.val);
            //check the right subtree
            int r = rec(A.right, A.val, max);
            return l & r;
        }else{
            return 0;
        }

    }
    public int isValidBST(TreeNode A) {

        //check null
        if(A == null){
            return 0;
        }

        //int max = Integer.MAX_VALUE;
        //int min = Integer.MIN_VALUE;
        //Make a recursive call
        int ans = rec(A, Long.MIN_VALUE, Long.MAX_VALUE);

        return ans;
    }

}
