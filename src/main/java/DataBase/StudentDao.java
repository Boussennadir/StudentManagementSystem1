package DataBase;

import com.example.system.Student;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    public static void insertStudent(Student student) {
        String sql = "INSERT INTO students(studentId, year, firstName, lastName, gendre, birthday, grade) VALUES(?,?,?,?,?,?,?)";

        try (Connection conn = DatabaseManager.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, student.getStudentId());
            pstmt.setInt(2, student.getYear());
            pstmt.setString(3, student.getFirstName());
            pstmt.setString(4, student.getLastName());
            pstmt.setString(5, student.getGendre());
            pstmt.setString(6, student.getBirthday().toString());
            pstmt.setDouble(7, student.getGrade());
            pstmt.executeUpdate();
            System.out.println("Student inserted.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<Student> getAllStudents() {
        String sql = "SELECT * FROM students";
        List<Student> students = new ArrayList<>();

        try (Connection conn = DatabaseManager.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Student student = new Student(
                        rs.getInt("studentId"),
                        rs.getInt("year"),
                        rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getString("gendre"),
                        LocalDate.parse(rs.getString("birthday")),
                        rs.getDouble("grade")
                );
                students.add(student);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return students;
    }

    public static void updateStudent(Student student) {
        String sql = "UPDATE students SET year = ?, firstName = ?, lastName = ?, gendre = ?, birthday = ?, grade = ? WHERE studentId = ?";

        try (Connection conn = DatabaseManager.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, student.getYear());
            pstmt.setString(2, student.getFirstName());
            pstmt.setString(3, student.getLastName());
            pstmt.setString(4, student.getGendre());
            pstmt.setString(5, student.getBirthday().toString());
            pstmt.setDouble(6, student.getGrade());
            pstmt.setInt(7, student.getStudentId());
            pstmt.executeUpdate();
            System.out.println("Student updated.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteStudent(int studentId) {
        String sql = "DELETE FROM students WHERE studentId = ?";

        try (Connection conn = DatabaseManager.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, studentId);
            pstmt.executeUpdate();
            System.out.println("Student deleted.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
