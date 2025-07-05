package leetCode.medium;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicates2 {

    public int removeDuplicates(int[] nums) {
        
        //check null
        if(nums == null || nums.length == 0){
            return -1;
        }

        //Traverse and update the map
        Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int n = nums.length;
        int k = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            int timesToAdd = Math.min(value,2);
            for(int i = 0; i < timesToAdd; i++){
                nums[k] = key;
                k++;
            }
        
        }
        
        return k;
        //TC: O(n)
        //SC: O(n)
    }

     public int removeDuplicates1(int[] nums) {
        
        //check null
        if(nums == null || nums.length == 0){
            return 0;
        }

        int k = 1;
        int count = 1;

        int n = nums.length;
        for(int i = 1; i < n; i++){
            //check adjacent element are equal
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                //elements are different
                count = 1;
            }

            if(count <= 2){
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
        //TC: O(n)
        //SC: O(1)
    }

}
