package DataBase;

import java.sql.*;

public class DatabaseManager {
    private static final String URL = "jdbc:sqlite:students.db";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL);
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
