package factory_abstractFactory;

import factory_abstractFactory.databaseComponents.createQuery.CreateQueryFactory;
import factory_abstractFactory.databaseComponents.createQuery.MySqlQueryFactory;
import factory_abstractFactory.databaseComponents.updateQuery.MySqlUpdateFactory;
import factory_abstractFactory.databaseComponents.updateQuery.UpdateQueryFactory;

public class MySQLDatabaseFactory implements DatabaseFactory{

    @Override
    public CreateQueryFactory createQuery() {
        // TODO Auto-generated method stub
        return new MySqlQueryFactory();
    }

    @Override
    public UpdateQueryFactory updateQuery() {
        // TODO Auto-generated method stub
        return new MySqlUpdateFactory();
    }
    
}
