package singleton;

public class DbConnectionEager {
    private static DbConnectionEager instance = new DbConnectionEager();

    private DbConnectionEager(){

    }

    public static DbConnectionEager getInstance(){
        return instance;
    }

}
