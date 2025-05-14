package trees;

public class Diameter {
    private int diameter = 0;

    // Height in terms of edges
    public int heightInEdges(TreeNode root) {
        if (root == null) return -1;  // Edge count: empty tree is -1

        int left = heightInEdges(root.left);
        int right = heightInEdges(root.right);

        //caculate the diameter
        diameter = Math.max(diameter, left+right+2);

        return 1 + Math.max(left, right);  // Count edge to child
    }
    public int solve(TreeNode A) {

        heightInEdges(A);
        return diameter;
    }

}
