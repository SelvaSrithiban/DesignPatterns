package exceptions.customExceptions;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    
    private List<String> books;

    BookLibrary(){
        books = new ArrayList<>();
    }

    void addBook(String bookName) throws InvalidBookNameException{
        if(!bookName.startsWith("Scaler")){
            throw new InvalidBookNameException(bookName + " - book name does not start with scaler");
        }else{
            books.add(bookName);
        }
    }
}
