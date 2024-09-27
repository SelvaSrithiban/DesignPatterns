package factory_abstractFactory;

public class Mongo extends Database{

    @Override
    DatabaseFactory createDatabaseFactory() {
        // TODO Auto-generated method stub
        return new MongoDatabaseFactory();
    }

   
    
}
