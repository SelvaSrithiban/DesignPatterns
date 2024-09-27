package factory_abstractFactory;

import java.util.Scanner;

import factory_abstractFactory.databaseComponents.createQuery.CreateQueryFactory;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
        String database = scanner.nextLine();
        Database db = Database.createDatabase(database);
        DatabaseFactory dbfactory = db.createDatabaseFactory();
        CreateQueryFactory query = dbfactory.createQuery();
        query.createQuery();
    }
}
