package generics;

import java.util.Arrays;

public class GenericMethods {

    public static <T> void sortArray(T[] arr){
        System.out.println(Arrays.toString(arr));

    }
    
    public static <T,U> void sortArray1(T[] arr, T[] arr1){
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

    }

    public static <T extends Comparable> int incrementNumber(T number){
        return 5;
    }

    public static <T extends Number> T incrementNumber(T number){
        return (T) Integer.valueOf(number.intValue() + 1);
    }
    public static void main(String[] args) {
        Integer[] arr = {1,2,4};
        String[] arr1 = {"Hello", "World"};
        System.out.println(incrementNumber(5));

        //sortArray(arr);
        //sortArray(arr1);
        sortArray1(arr, arr1);
    }
}
