package trees;

import java.util.ArrayList;
import java.util.Collections;

public class LCA {

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
    public int lca(TreeNode A, int B, int C) {
        ArrayList<Integer> path1 = getPathToRoot(A,B);
        ArrayList<Integer> path2 = getPathToRoot(A,C);

        // Reverse both paths to get them from root to node
        Collections.reverse(path1);
        Collections.reverse(path2);

        int ans = -1;
        for(int i = 0; i < Math.min(path1.size(),path2.size()); i++){
            if(path1.get(i) == path2.get(i)){
                ans = path1.get(i);
            }else{
                break;
            }
        }
        return ans;
    }

}
