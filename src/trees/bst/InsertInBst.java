package trees.bst;

class TreeNode {
    int val;
   TreeNode left;
    TreeNode right;
    TreeNode(int x) {
     val = x;
     left=null;
     right=null;
    }
}

public class InsertInBst {

    public TreeNode insertNode1(TreeNode A, int k){

        //base case
        if(A == null){
            TreeNode node = new TreeNode(k);
            return node;
        }

        //if k is smaller 
        if(A.val >= k){
            A.left = insertNode1(A.left, k);
        }else{
            A.right = insertNode1(A.right, k);
        }

        return A;
    }

    //Overlap the node if already present
    public TreeNode insertNode2(TreeNode A, int k){

        //base case
        if(A == null){
            TreeNode node = new TreeNode(k);
            return node;
        }

        //if k is smaller 
        if(A.val > k){
            A.left = insertNode2(A.left, k);
        }else{
            A.right = insertNode2(A.right, k);
        }

        return A;
    }

}
