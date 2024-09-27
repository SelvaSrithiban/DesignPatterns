package factory_abstractFactory;

public abstract class Database {
    
    abstract DatabaseFactory createDatabaseFactory();

    public static Database createDatabase(String database){

        if(database.equals("MySQL")){
            return new MySql();
        }else if(database.equals("Mongo")){
            return new Mongo();
        }

        return null;
    }
    
}
