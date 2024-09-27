package factory_abstractFactory.databaseComponents.createQuery;

public class MySqlQueryFactory implements CreateQueryFactory{

    @Override
    public void createQuery() {
        // TODO Auto-generated method stub
        System.out.println("Creating MySQL query");
    }

    @Override
    public void insertQuery() {
        // TODO Auto-generated method stub
        System.out.println("Inserting MySQL query");
    }
    

}
