package leetCode.medium;

public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        
        //check null
        if(nums == null || nums.length < k){
            return 0;
        }
        int n = nums.length;
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int zeros = 0;

        while(right < n){
            //check right element is zero
            if(nums[right] == 0){
                zeros++;
            }

            //check zeroes exceeded k
            while(zeros > k){
                if(nums[left] == 0){
                    zeros--;
                }
                left++;
            }

            //update maxLen
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }
}
