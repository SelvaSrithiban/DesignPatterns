package generics;

import java.util.*;

public class UnboundedWildcardExample {
    // Method to print any type of List
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void addElements(List<?> list) {
        // list.add("Hello"); // Error: Cannot add anything except null
        // list.add(10); // Error: Cannot add anything except null
        
        // Only null is allowed
        list.add(null);
        list.add("String"); 
    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Apple", "Banana", "Cherry");
        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);
        stringList.add("Selva");  //--> This will thrown RunTime Exception

        // We can pass any type of List to this method
        printList(stringList);
        printList(intList);
        printList(doubleList);
    }
}