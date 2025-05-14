package trees;

import java.util.*;

class Pair{
    TreeNode node;
    int level;

    Pair(TreeNode node, int level){
        this.node = node;
        this.level = level;
    }
}

public class TopView {
    public ArrayList<Integer> verticalOrderTraversal(TreeNode A) {

        //check null
        if(A == null){
            return new ArrayList<>();
        }

        //Create Queue, Map, ArrayList, minimum, maximum level
        Queue<Pair> q = new ArrayDeque<>();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int minLevel = 0;
        int maxLevel = 0;

        //Add the root node to Queue
        q.add(new Pair(A,0));

        while(!q.isEmpty()){
            //Remove the peek element
            Pair tmp = q.poll();
            TreeNode node = tmp.node;
            int level = tmp.level;

            //Update the maxValue and Minvalue
            minLevel = Math.min(minLevel, level);
            maxLevel = Math.max(maxLevel, level);

            //Update the Map
            if(map.containsKey(level)){
                //update the existing key
                map.get(level).add(node.val);
            }else{
                //add the level to the map
                map.putIfAbsent(level, new ArrayList<>());
                map.get(level).add(node.val);
            }

            //Add the left node to Queue
            if(node.left != null){
                q.add(new Pair(node.left, level - 1));
            }

            //Add the right node to Queue
            if(node.right != null){
                q.add(new Pair(node.right, level + 1));
            }
        }

        //Update the ans ArrayList
        for(int i = minLevel; i <= maxLevel; i++){
            
            ArrayList<Integer> list = map.get(i);

            if (list != null && !list.isEmpty()) {
                ans.add(list.get(0)); // ✅ Add the first value in the list
            }

        }
        
        return ans;
    }
}

