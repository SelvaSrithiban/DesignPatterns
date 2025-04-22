package dsa_Problems.interviewProblems;

public class fibonacci {

    public static void printFibonnaci(int N){

        //check for the edge case
        if(N == 0){
            System.out.println(0);
            return;
        }

        int first = 0;
        int second = 1;

        for(int i = 0; i < N; i++){
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        return;
    }

    public static void main(String[] args) {
        printFibonnaci(8);
    }

}
