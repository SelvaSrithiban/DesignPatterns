package trees.bst;

public class SortedArrayToBalanceBst {

    public TreeNode buildBst(int[] A, int start, int end){

        //base case
        if(start > end){
            return null;
        }

        //assumption
        //Calcluate the mid 
        int mid = start + (end - start)/2;
        //create the root node
        TreeNode root = new TreeNode(A[mid]);       
        //root.val = A[mid];   
        //create left sub tree
        root.left = buildBst(A, start, mid-1);
        //create right sub tree
        root.right = buildBst(A, mid+1, end);

        return root;
    }
    public TreeNode sortedArrayToBST(final int[] A) {

        //check null
        if(A == null || A.length == 0){
            return null;
        }
        int start = 0;
        int end = A.length - 1;

        //call to recursive function
        TreeNode root = buildBst(A, start, end);

        return root;
    }

}
