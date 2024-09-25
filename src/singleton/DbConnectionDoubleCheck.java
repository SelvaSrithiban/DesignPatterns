package singleton;

public class DbConnectionDoubleCheck {
    private static DbConnectionDoubleCheck instance;
    private String param1;
    private String param2;
    private String param3;

    private DbConnectionDoubleCheck(String param1, String param2){
        this.param1 = param1;
        this.param2 = param2;
    }

    private DbConnectionDoubleCheck(String param1, String param2, String param3){
        this(param1, param2);
        this.param3 = param3;
    }

    public static DbConnectionDoubleCheck getInstance(String param1, String param2, String param3){
        if(instance == null){
            synchronized(DbConnectionDoubleCheck.class){
            if(instance == null){
                instance = new DbConnectionDoubleCheck(param1, param2, param3);

            }
        }
        }
        return instance;
    }

    public static DbConnectionDoubleCheck getInstance(String param1, String param2){
        if(instance == null){
            synchronized(DbConnectionDoubleCheck.class){
            if(instance == null){
                instance = new DbConnectionDoubleCheck(param1, param2);

            }
        }
        }
        return instance;
    }

}
