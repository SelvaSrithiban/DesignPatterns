package factory_factoryMethods;

public class Mongo extends Database{

    @Override
    public void createQuery() {
        // TODO Auto-generated method stub
        System.out.println("Creating MongoDB Query");
    }

    @Override
    public void createTransaction() {
        // TODO Auto-generated method stub
        System.out.println("Creating MongoDB Transaction");
    }

    @Override
    public void createUpdator() {
        // TODO Auto-generated method stub
        System.out.println("Updating MongoDB Query");
    }
    
}
