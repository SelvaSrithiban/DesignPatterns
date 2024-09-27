package factory_abstractFactory;

public class MySql extends Database{

    @Override
    DatabaseFactory createDatabaseFactory() {
        // TODO Auto-generated method stub
        return new MySQLDatabaseFactory();
    }

    
    
}
