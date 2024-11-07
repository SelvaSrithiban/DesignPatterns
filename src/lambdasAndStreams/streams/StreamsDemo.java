package lambdasAndStreams.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//import lambdasAndStreams.Players;
import lambdasAndStreams.*;

public class StreamsDemo {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.addAll(0, Arrays.asList("apple","banana","orange","pineapple"));

        //Filter the apple using normal logic
        List<String> filteredFruits = new ArrayList<>();
        for(String fruit: fruits){
            if(fruit.contains("apple")){
                filteredFruits.add(fruit.toUpperCase());
            }
        }   
        
        System.out.println(filteredFruits);

        //New Approach using Streams
        List<String> output = fruits.stream()
                                .filter(fruit->fruit.contains("apple"))
                                .map(fruit->fruit.toUpperCase())
                                .collect(Collectors.toList());

        System.out.println("output is " + output);

        //Filer even numbers
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<Integer> evenNumbers = numbers.stream().filter(number->number%2 == 0).map(number->number*number).collect(Collectors.toList());
        System.out.println(evenNumbers);

        //Sum of Fruit lens
        int sumOfFruitsLens = fruits.stream()
                                .filter(fruit->fruit.contains("apple"))
                                .map(fruit->fruit.length())
                                .mapToInt(Integer::intValue)  //.mapToInt(number->number.intValue())
                                .sum();

        System.out.println(sumOfFruitsLens);




    }
    
}
