package trees;

public class IsTreeBalanced {

    static int isBalancedFlag;
    public int isBalanced(TreeNode A) {

        //check null
        if(A == null){
            return -1;
        }
        //assuming the tree is balanced
        isBalancedFlag = 1;
        //compute the tree is balanced
        checkHeight(A);
        
        return isBalancedFlag;
    }
    public int checkHeight(TreeNode A){
        if(A == null){
            return 0;
        }

        //compute the height of left subtree 
        int lh = checkHeight(A.left);
        //compute the height of right subtree
        int rh = checkHeight(A.right);
        
        if(Math.abs(lh - rh) > 1){
            isBalancedFlag = 0;
        }

        return Math.max(lh,rh) + 1;
    }

}
