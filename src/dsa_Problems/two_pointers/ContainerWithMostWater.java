package dsa_Problems.two_pointers;

public class ContainerWithMostWater {

    public int maxArea(int[] A) {

        int maxArea = -1;
        if(A.length == 1){   //if the length of the array is 1
            return 0;
        }
        int i = 0;
        int j = A.length - 1;
        while(i < j){
            //calculate area of the two indexes
            int area = Math.min(A[i], A[j]) * (j-i);
            if(area > maxArea){
                maxArea = area;
            }
            if(A[i]<A[j]){   //Move the i pointer
                i++;
            }else if(A[i] > A[j]){ //Move the j pointer
                j--;
            }else{      //move both if both are equal
                i++;
                j--;
            }
        }
        return maxArea;

    }

}
