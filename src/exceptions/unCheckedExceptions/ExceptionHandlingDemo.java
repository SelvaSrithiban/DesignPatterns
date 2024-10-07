package exceptions.unCheckedExceptions;

public class ExceptionHandlingDemo {
    
    static void divide(int a, int b){
        try{
            System.out.println(a/b);
        }catch(Exception exception){
            //System.out.println("Dividing by zero");
            //System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
        
    }

    public static void main(String[] args) {
        divide(10, 0);
        System.out.println("Main is still executing");
    }
}
