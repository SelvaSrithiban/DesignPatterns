package leetCode.medium;

public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {

        //check null
        if(nums == null || nums.length < 3){
            return false;
        }
        int n = nums.length;
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int num : nums){
            //update first
            if(num <= first){
                first = num;
            }else if(num <= second){
                second = num;
            }else{
                return true;
            }
        }

        return false;
    }
}
