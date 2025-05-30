package leetCode.easy;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //check null
        if(nums1 == null || nums2 == null){
            return;
        }
        if(n == 0){
            return;
        }
        //Traverse from the end
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }else{
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }

        //copy remaining elements
        while(j >= 0){
            nums1[k] = nums2[j];
                j--;
                k--;
        }

    }

}
