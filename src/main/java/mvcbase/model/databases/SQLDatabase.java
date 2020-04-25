package mvcbase.model.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author emiliohdez
 * This class is a skeleton of a database connection, let's suppose that we need a MySQL connection
 */
public class SQLDatabase {
    private static SQLDatabase instance;
    private Connection connection;
    private final static String DBNAME = "database";
    private final static String USERNAME = "username";
    private final static String PASSWORD = "password";

    private SQLDatabase() throws SQLException {
        String url = String.format("jdbc:mysql://localhost/%s?user=%s&password=%s", DBNAME, USERNAME, PASSWORD);
        this.connection = DriverManager.getConnection(url);
    }

    private Connection getConnectionInstance() {
        return connection;
    }

    public static Connection getConnection() throws SQLException {
        if (instance == null || instance.getConnectionInstance().isClosed())
            instance = new SQLDatabase();
        return instance.getConnectionInstance();
    }

}
