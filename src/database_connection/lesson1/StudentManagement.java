package database_connection.lesson1;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StudentManagement {
    private static final String USER = "sa";
    private static final String PASSWORD = "123";
    private static final String SERVER_NAME = "LAPTOP-LLTJI6NG\\SQLEXPRESS";
    private static final String DB_NAME = "student_management";
    private static final int PORT = 1433;

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        // cách 1: sử dụng PrepareStatement
        students.addAll(readStudentUsingPrepareStatement());
        System.out.println("============================== Đọc dữ liệu sử dụng" +
                "PrepareStatement ==============================");
        showStudents(students);

        // cách 2: sử dụng Statement
        students.clear();
        students.addAll(readStudentUsingStatement());
        System.out.println("============================== Đọc dữ liệu sử" +
                " dụng Statemen t==============================");
        showStudents(students);
    }

    private static Collection<? extends Student> readStudentUsingStatement() {
        List<Student> students = new ArrayList<>();
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "SELECT * FROM dbo.student";
            var statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                var id = resultSet.getString(1);
                var name = resultSet.getString(2);
                var address = resultSet.getString(3);
                var email = resultSet.getString(4);
                var major = resultSet.getString(5);
                var avgGrade = resultSet.getFloat(6);
                var student = new Student(id, name, address, email, major, avgGrade);
                students.add(student);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return students;
    }

    private static void showStudents(List<Student> students) {
        System.out.printf("%-20s%-25s%-25s%-25s%-25s%-15s\n", "Mã SV",
                "Họ và tên", "Địa chỉ", "Email", "Chuyên ngành", "Điểm TB");
        for (var student : students) {
            System.out.printf("%-20s%-25s%-25s%-25s%-25s%-15.2f\n", student.getId(),
                    student.getFullName(), student.getAddress(), student.getEmail(),
                    student.getMajor(), student.getAvgGrade());
        }
    }

    private static Collection<? extends Student> readStudentUsingPrepareStatement() {
        List<Student> students = new ArrayList<>();
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "SELECT * FROM dbo.student";
            var ps = conn.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                var id = resultSet.getString(1);
                var name = resultSet.getString(2);
                var address = resultSet.getString(3);
                var email = resultSet.getString(4);
                var major = resultSet.getString(5);
                var avgGrade = resultSet.getFloat(6);
                var student = new Student(id, name, address, email, major, avgGrade);
                students.add(student);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return students;
    }

    private static SQLServerDataSource configDataSource() {
        SQLServerDataSource dataSource = new SQLServerDataSource();
        dataSource.setUser(USER);
        dataSource.setPassword(PASSWORD);
        dataSource.setPortNumber(PORT);
        dataSource.setServerName(SERVER_NAME);
        dataSource.setDatabaseName(DB_NAME);
        dataSource.setTrustServerCertificate(true);
        return dataSource;
    }
}
