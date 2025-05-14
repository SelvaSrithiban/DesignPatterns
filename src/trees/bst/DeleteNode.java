package trees.bst;

public class DeleteNode {

    public class Solution {

        public int maxValue(TreeNode A){
    
            //check null
            if(A == null){
                return -1;
            }
            int ans = -1;
            TreeNode curr = A;
            while(curr.right != null){
                curr = curr.right;
            }
    
            return curr.val;
        }
    
        public TreeNode solve(TreeNode A, int B) {
    
            //base case
            if(A == null){
                return null;
            }
    
            //if A is greater than B 
            if(A.val > B){
                //move left
                A.left = solve(A.left,B);
            }else if(A.val < B){
                //move right
                A.right = solve(A.right, B);
            }else{ //if A equals b
                //if target has no TreeNode
                if(A.left == null && A.right == null){
                    return null;
                }else if(A.left != null && A.right == null){
                    //if only one node is present in left subtree
                    return A.left;
                }else if(A.left == null && A.right != null){
                    //if only one node is present in right subtree
                    return A.right;
                }else{
                    //if multiple nodes are present
                    //find the max element in the left subtree
                    int max = maxValue(A);
                    //replace the root value with max value
                    A.val = max;
                    //Remove the max node from the tree
                    A.left = solve(A.left, max);
                }
    
            }
            return A;
        }
    }

}
