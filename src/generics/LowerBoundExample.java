package generics;

import java.util.*;

public class LowerBoundExample {
    public static void addNumbers(List<? super Integer> list) {
        // We can add Integer elements or its subclasses (if any)
        list.add(10);
        list.add(20);
        
        //list.add(3.14); // Error! You can't add a Double because it's not an Integer or subclass of Integer
    }

    public static void printList(List<? super Integer> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();
        
        // We can pass both numberList and objectList because they are superclasses of Integer
        addNumbers(numberList);
        addNumbers(objectList);
        //addNumbers(doubleList);

        // Printing the lists
        System.out.println("Number List:");
        printList(numberList);
        System.out.println("Object List:");
        printList(objectList);
    }
}

