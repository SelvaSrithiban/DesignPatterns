package leetCode.medium;

import java.util.HashMap;

public class MaxNumOfKPairs {
     public int maxOperations(int[] nums, int k) {

        //check null
        if(nums == null || nums.length < 2){
            return 0;
        }

        int ans = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(nums[i] > 0 && nums[j] > 0){
                    if(nums[i] + nums[j] == k){
                        ans++;
                        nums[i] = -1;
                        nums[j] = -1;
                    }
                }
            }
        }

        return ans;
        
    }

    public int maxOperations1(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            int complement = k - num;

            // Check if complement is available
            if (map.getOrDefault(complement, 0) > 0) {
                count++; // Found a valid pair
                map.put(complement, map.get(complement) - 1); // Use up one complement
            } else {
                // Save current number for future pairing
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        return count;
    }
}
