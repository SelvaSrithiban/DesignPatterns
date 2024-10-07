package exceptions.customExceptions;

public class InvalidBookNameException extends RuntimeException{

    public InvalidBookNameException(String msg){
        super(msg);
    }
}