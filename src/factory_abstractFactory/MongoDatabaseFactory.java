package factory_abstractFactory;

import factory_abstractFactory.databaseComponents.createQuery.CreateQueryFactory;
import factory_abstractFactory.databaseComponents.createQuery.MongoQueryFactory;
import factory_abstractFactory.databaseComponents.updateQuery.MongoUpdateFactory;
import factory_abstractFactory.databaseComponents.updateQuery.UpdateQueryFactory;

public class MongoDatabaseFactory implements DatabaseFactory{

    @Override
    public CreateQueryFactory createQuery() {
        // TODO Auto-generated method stub
        return new MongoQueryFactory();
    }

    @Override
    public UpdateQueryFactory updateQuery() {
        // TODO Auto-generated method stub
        return new MongoUpdateFactory();

    }
    
}
