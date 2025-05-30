package leetCode.easy;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        
        //check null
        if(nums == null){
            return -1;
        }
        int n = nums.length;
        int k = n;
        
        if(n == 0){
            return 0;
        }
        /*if(n == 1){
            if(nums[0] == val){
                nums[0] = 0;
                k--;
            }
            return k;
        }*/
        int i = 0;
        int j = n-1;
        while((i <= j)){
            if(nums[i] == val){
                //swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = 0;
                j--;
                k--;
            }else{
                i++;
            }
        }
        
        return k;
    }

}
