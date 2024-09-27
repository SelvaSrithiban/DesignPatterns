package factory_abstractFactory;

import factory_abstractFactory.databaseComponents.createQuery.CreateQueryFactory;
import factory_abstractFactory.databaseComponents.updateQuery.UpdateQueryFactory;

public interface DatabaseFactory {
    
    CreateQueryFactory createQuery();

    UpdateQueryFactory updateQuery();
}
