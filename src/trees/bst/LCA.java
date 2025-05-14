package trees.bst;

public class LCA {
    public int solve(TreeNode A, int B, int C) {

        int ans = -1;

        while(A != null){
            //check where the element
            if(A.val < B && A.val < C){
                A = A.right;
            }else if(A.val > B && A.val > C){
                A = A.left;
            }else{
                ans =  A.val;
                break;
            }
        }

        return ans;
    }

}
