package trees;

import java.util.ArrayList;

public class NodeToRootPath {

    public ArrayList<Integer> getPathToRoot(TreeNode A, int B) {
        ArrayList<Integer> path = new ArrayList<>();
        dfs(A, B, path);
        return path;
    }

    private boolean dfs(TreeNode root, int node, ArrayList<Integer> path) {
        if (root == null)
            return false;

        if (root.val == node) {
            path.add(root.val);
            return true;
        }

        if (dfs(root.left, node, path) || dfs(root.right, node, path)) {
            path.add(root.val);
            return true;
        } else {
            return false;
        }
    }


}
