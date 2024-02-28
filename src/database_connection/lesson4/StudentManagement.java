package database_connection.lesson4;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * DELETE FROM [tên_bảng] WHERE điều_kiện
 */

public class StudentManagement {
    private static final String USER = "sa";
    private static final String PASSWORD = "123";
    private static final String SERVER_NAME = "LAPTOP-LLTJI6NG\\SQLEXPRESS";
    private static final String DB_NAME = "student_management";
    private static final int PORT = 1433;

    public static void main(String[] args) {
        var studentId = "B25DCQT103"; // mã sinh viên cần xóa
        int result = deleteUsingStatement(studentId);
//        int result = deleteUsingPreparedStatement(studentId);
        if (result > 0) {
            System.out.println("==> Xóa sinh viên thành công! <==");
        } else {
            System.out.println("==> Thao tác xóa thất bại! <==");
        }
        System.out.println("==> DANH SÁCH SINH VIÊN SAU KHI XÓA <==");
        var students = getStudentsFromDB();
        showStudentsInfo(students);
    }

    private static int deleteUsingPreparedStatement(String studentId) {
        SQLServerDataSource dataSource = configDataSource();
        try (var conn = dataSource.getConnection()) {
            var sql = "DELETE FROM dbo.student WHERE id = ?";
            var ps = conn.prepareStatement(sql);
            ps.setString(1, studentId);
            return ps.executeUpdate();
        } catch (SQLServerException e) {
            e.printStackTrace();
            return -1;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    /**
     * Phương thức dùng để hiển thị thông tin các sinh viên trong danh sách
     *
     * @param students danh sách sinh viên cần hiển thị
     */
    private static void showStudentsInfo(List<Student> students) {
        System.out.printf("%-20s%-25s%-25s%-25s%-30s%-15s\n", "Mã SV",
                "Họ tên", "Địa chỉ", "Email", "Chuyên ngành", "Điểm TB");
        for (var student : students) {
            System.out.printf("%-20s%-25s%-25s%-25s%-30s%-15.2f\n", student.getId(),
                    student.getName(), student.getAddress(), student.getEmail(),
                    student.getMajor(), student.getAvgGrade());
        }
    }

    /**
     * Phương thức sử dụng để xóa sinh viên khỏi CSDL
     * theo mã cho trước sử dụng Statement
     *
     * @param studentId mã sinh viên cần xóa khỏi bảng
     * @return số hàng bị ảnh hưởng bởi hành động xóa này
     */
    private static int deleteUsingStatement(String studentId) {
        SQLServerDataSource dataSource = configDataSource();
        try (var conn = dataSource.getConnection()) {
            var sql = "DELETE FROM dbo.student WHERE id = '" + studentId + "'";
            var statement = conn.createStatement();
            return statement.executeUpdate(sql);
        } catch (SQLServerException e) {
            e.printStackTrace();
            return -1;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    /**
     * Đọc danh sách sinh viên từ cơ sở dữ liệu ra
     *
     * @return danh sách sinh viên có trong bảng csdl
     */
    private static List<Student> getStudentsFromDB() {
        List<Student> students = new ArrayList<>();
        var sql = "SELECT * FROM dbo.student";
        SQLServerDataSource dataSource = configDataSource();
        try (var conn = dataSource.getConnection()) {
            var statement = conn.createStatement();
            var resultSet = statement.executeQuery(sql);
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
        } catch (SQLServerException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return students;
    }

    /**
     * Phương thức helper thiết lập thông số đầu vào cho kết nối
     * đến SQL Server
     *
     * @return
     */
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
