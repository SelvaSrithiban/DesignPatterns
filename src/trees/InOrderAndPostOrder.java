package trees;

import java.util.ArrayList;
import java.util.Arrays;


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

public class InOrderAndPostOrder {

    public int findIndex(ArrayList<Integer> inorder, int start, int end, int value) {
    for (int i = start; i <= end; i++) {
        if (inorder.get(i) == value) {
            return i;
        }
    }
    return -1; 
    }

    public TreeNode recursion(ArrayList<Integer> A, ArrayList<Integer> B, int start, int end, int postIndex){

        //base case
        if(start > end){
            return null;
        }

        //compute the rootValue
        int rootValue = B.get(postIndex);
        //Create the root TreeNode
        TreeNode node = new TreeNode(rootValue);

        //Get the postIndex indices in A 
        int i = findIndex(A, start, end, rootValue);

        //make a recursive call to create left subtree
        node.left = recursion(A, B, start, i-1, postIndex - (end - i + 1));
        //make a recursive call to create right subtree
        node.right = recursion(A, B, i+1, end, postIndex-1);

        return node;

    }
    public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {

        //check null
        if(A == null || B == null || A.size() == 0 || A.size() != B.size()){
            return null;
        }

        int n = A.size();

        //Initialize root TreeNode
        TreeNode root;

        //Recursive call
        root = recursion(A, B, 0, n-1, n-1);

        return root;
    }

    public void printPreorder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    public static void main(String[] args) {

        InOrderAndPostOrder buildTree = new InOrderAndPostOrder();

        ArrayList<Integer> inorder = new ArrayList<>(Arrays.asList(9, 3, 15, 20, 7));
        ArrayList<Integer> postorder = new ArrayList<>(Arrays.asList(9, 15, 7, 20, 3));

        TreeNode root = buildTree.buildTree(inorder, postorder);

        System.out.println("\nPreorder traversal of constructed tree:");
        buildTree.printPreorder(root);
        
    }

}
