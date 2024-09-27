package factory_abstractFactory.databaseComponents.createQuery;

public class MongoQueryFactory implements CreateQueryFactory{

    @Override
    public void createQuery() {
        // TODO Auto-generated method stub
        System.out.println("Creating Mongo file");
    }

    @Override
    public void insertQuery() {
        // TODO Auto-generated method stub
        System.out.println("Inserting data into the mongo file");
    }
    
}
