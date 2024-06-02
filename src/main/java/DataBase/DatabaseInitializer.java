package DataBase;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class DatabaseInitializer {
    public static void createStudentsTable() {
        String sql = "CREATE TABLE IF NOT EXISTS students ("
                + "studentId INTEGER PRIMARY KEY,"
                + "year INTEGER,"
                + "firstName TEXT,"
                + "lastName TEXT,"
                + "gendre TEXT,"
                + "birthday TEXT,"
                + "grade REAL"
                + ");";

        try (Connection conn = DatabaseManager.connect();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table 'students' created.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
