package dsa_Problems.recursion;

public class TowerOfHanoe {

    public static void toh(int n, char A, char B, char C){

        //base case
        if(n == 0){
            return;
        }

        //Move n-1 disks from A to B
        toh(n-1,A,C,B);

        //Move the nth disk from A to C
        System.out.println("Move " + n + " disk from " + A + " to " + C);

        //Move n-1 disks from B to C
        toh(n-1,B,A,C);

        return;
    }

    public static int[][] towerOfHanoi(int A) {
        int m = (1 << A) - 1;  // Calculate the number of moves
        int[][] ans = new int[m][3];
        int[] curr = {0};  // Use an array to pass 'curr' by reference
        rec(A, 1, 3, curr, ans);  // Initial call to recursive function
        return ans;
    }

    public static void rec(int disk, int start, int end, int[] curr, int[][] ans) {
        if (disk == 1) {
            ans[curr[0]++] = new int[]{disk, start, end};
            return;
        }
        int buffer = 6 - start - end;  // Calculate the buffer tower
        rec(disk - 1, start, buffer, curr, ans);  // Move (disk - 1) disks to buffer
        ans[curr[0]++] = new int[]{disk, start, end};  // Move the nth disk from start to end
        rec(disk - 1, buffer, end, curr, ans);  // Move (disk - 1) disks to end
    }


    //1st call - last two tower value are getting interchanged
    //2nd call - first two tower value are getting interchanged
    public static void main(String[] args) {
        int n = 3;
        toh(n,'A','B','C'); 

        int[][] moves = towerOfHanoi(n);
        
        // Display the moves
        for (int[] move : moves) {
            System.out.println("Move disk " + move[0] + " from tower " + move[1] + " to tower " + move[2]);
        }

    }
}
