package dsa_Problems.iterations;

public class Client {
    public static void main(String[] args) {
        //int[] arr = new int[10];
        //System.out.println(arr[6]);
        int[] arr1 = {1,1,4,9,4,7,1};
        SwiftRightToLeft swiftRightToLeft = new SwiftRightToLeft();
        swiftRightToLeft.solve(arr1, 9);

        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }

    }
}
