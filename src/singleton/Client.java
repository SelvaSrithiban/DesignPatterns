package singleton;

public class Client {

    //DbConnection db = new DbConnection("MySql","SQL");
    //DbConnection db1 = new DbConnection("MySql","SQL");
    //DbConnection db = DbConnection.getInstance();
    DbConnectionDoubleCheck insConnectionDoubleCheck;
    insConnectionDoubleCheck = DbConnectionDoubleCheck.getInstance();
}
