package trees.bst;

public class MaxAndMin {

    public int maxElement(TreeNode A){

        //check null
        if(A == null){
            return -1;
        }

        TreeNode curr = A;

        while(curr.right != null){
            curr = curr.right;
        }

        return curr.val;
    }

    public int minElement(TreeNode A){

         //check null
        if(A == null){
            return -1;
        }

        TreeNode curr = A;

        while(curr.left != null){
            curr = curr.left;
        }
        
        return curr.val;
    }

}
