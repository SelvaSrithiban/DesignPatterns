package trees;

public class HeightOfTree {

    // Height in terms of nodes
    public static int heightInNodes(TreeNode root) {
        if (root == null) return 0;

        int left = heightInNodes(root.left);
        int right = heightInNodes(root.right);

        return 1 + Math.max(left, right);  // Count current node
    }

    // Height in terms of edges
    public static int heightInEdges(TreeNode root) {
        if (root == null) return -1;  // Edge count: empty tree is -1

        int left = heightInEdges(root.left);
        int right = heightInEdges(root.right);

        return 1 + Math.max(left, right);  // Count edge to child
    }

    public static void main(String[] args) {
        /*
               1
              / \
             2   3
            /
           4
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        System.out.println("Height (nodes): " + heightInNodes(root));  // Output: 3
        System.out.println("Height (edges): " + heightInEdges(root));  // Output: 2
    }

}
