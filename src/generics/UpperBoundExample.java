package generics;

import java.util.*;

public class UpperBoundExample {
    public static void printList(List<? extends Number> list) {
        for (Number num : list) {
            System.out.println(num);
        }
    }

    public static void addElements(List<? extends Number> list) {
        // Compilation Error: Can't add elements of any type because the exact type is unknown

        // list.add(10); // Error: Not allowed
        // list.add(3.14); // Error: Not allowed
        // list.add(new Integer(5)); // Error: Not allowed

        // Only null is allowed
        list.add(null);
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);
        addElements(doubleList);

        // We can pass a List of Integers or Doubles because they extend Number
        printList(intList);
        printList(doubleList);
    }
} 

