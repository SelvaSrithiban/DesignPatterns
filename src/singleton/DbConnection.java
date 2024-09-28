package singleton;

public class DbConnection {
    private static String dbName;
    private static String dbType;
    private static int poolSize;
    static DbConnection instance = new DbConnection(dbName, dbType);
    static DbConnection instance1 = new DbConnection(dbName, dbType, poolSize);
    private DbConnection(String dbName, String dbType){
        this.dbName = dbName;
        this.dbType = dbType;
    }

    public DbConnection(String dbName2, String dbType2, int poolSize) {
        //TODO Auto-generated constructor stub
        this(dbName, dbType);
        this.poolSize = poolSize;
    }

    public static DbConnection getInstance(){
        return instance;
    }
}
