package exceptions.unCheckedExceptions;

import java.util.Scanner;

public class ArrayExceptions {


    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        System.out.println(arr[index]);

    }
    
}
