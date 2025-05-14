package trees;

public class LCATUF {

     //bAse case
     if(A == null || A.val == B || A.val == C){
        return A;
    }

    TreeNode left = rec(A.left, B, C);
    TreeNode right = rec(A.right, B, C);

    if(left == null){
        return right;
    }else if(right == null){
        return left;
    }else{
        return A;
    }
 }

 public int lca(TreeNode A, int B, int C) {
    
     TreeNode result = rec(A,B,C);
     return result != null ? result.val : -1;
 }

}
