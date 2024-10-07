package decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        
        Beverage beverage = new Decaf();

        System.out.println(beverage.getDescription());
        System.out.println(beverage.getCost());

        beverage = new Milk(beverage);

        System.out.println(beverage.getDescription());
        System.out.println(beverage.getCost());

        beverage = new Mocha(beverage);

        System.out.println(beverage.getDescription());
        System.out.println(beverage.getCost());

        beverage = new Whip(beverage);

        System.out.println(beverage.getDescription());
        System.out.println(beverage.getCost());

        /* 
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = Collections.synchronizedList(list);

        try (InputStream inputStream = new FileInputStream("example.text")) {
            inputStream = new BufferedInputStream(inputStream);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        */

        
    }
    
}
