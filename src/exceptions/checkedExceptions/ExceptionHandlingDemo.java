package exceptions.checkedExceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingDemo {

    static void readFIle(String filename){
        try {
            FileReader fileReader = new FileReader(filename);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("Please enter a correct filename");
        }
    }

    public static void main(String[] args) {
        readFIle("abc.txt");
        System.out.println("Main is still executing");
    }
    
}
