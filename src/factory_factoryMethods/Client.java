package factory_factoryMethods;

public class Client {
    //private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Database database = new Mongo();
        //String db = scanner.nextLine();

        if(database instanceof MySql){
            database.createQuery();
            database.createTransaction();
            database.createUpdator();
        }else if(database instanceof Mongo){
            database.createQuery();
            database.createTransaction();
            database.createUpdator();
        }
        
    }
}
