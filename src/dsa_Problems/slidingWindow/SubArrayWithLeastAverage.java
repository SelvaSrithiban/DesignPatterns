package dsa_Problems.slidingWindow;

public class SubArrayWithLeastAverage {

    static int optimized(int[] A, int B){

        int index = 0;
        int n = A.length;
        int s = 0;
        int e = B-1;
        double average = Double.MAX_VALUE;
    
        //Slide through the first Subarray
        double sum = 0;
        for(int i = s; i < e; i++){
            sum += A[i];
        }
        //Calculate current average
        double curAvg = sum/ (double)B;
        //Check if the current average is greater than last average
        if(curAvg < average){
            average = curAvg;
            index = s;
        }
        System.out.println("Index after sliding window " + s + " is " + index);
        s++;
        e++;

        //Slide through the rest of the Subarray
        while(e < n){
            sum = sum - A[s-1] + A[e];
            curAvg = sum/(double) B;
            if(curAvg < average){
                average =curAvg;
                index = s;
            }
            System.out.println("Index after sliding window " + s + " is " + index);
            s++;
            e++;
        }
    
        return index;

    }

    public static void main(String[] args) {

        //int[] A = {3, 7, 90, 20, 10, 50, 40};
        //int B = 3;
        int[] A = {15,7,11,7,9,8,18,1,16,18,6,1,1,4,18};
        int B = 6;
        System.out.println(optimized(A, B));
        
    }
    
}
