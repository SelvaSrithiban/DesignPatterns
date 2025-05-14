package trees;

import java.util.ArrayList;

public class kthSmallestElement {

    public ArrayList<Integer> traversal(TreeNode A, ArrayList<Integer> inOrder){

        //check null
        if(A == null){
            return inOrder;
        }

        //Traverse through the left TreeNode
        traversal(A.left, inOrder);
        //Add the root node to ans
        inOrder.add(A.val);
        //Traverse through the right TreeNode
        traversal(A.right, inOrder);

        return inOrder;
    }
    public int kthsmallest(TreeNode A, int B) {

        ArrayList<Integer> inOrder = new ArrayList<>();
        inOrder = traversal(A,inOrder);

        int ans = -1;

        //return the kth elememt
        for(int i = 0; i < B; i++){
            ans = inOrder.get(i);
        }

        return ans;
    }

}
