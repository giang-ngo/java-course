package database_connection.lesson3;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * UPDATE [tên_bảng] SET (tên_cột1 = giá trị1, tên_cột2 = giá trị2,…) WHERE điều_kiện
 */
public class StudentManagement {
    private static final String USER = "sa";
    private static final String PASSWORD = "123";
    private static final String SERVER_NAME = "LAPTOP-LLTJI6NG\\SQLEXPRESS";
    private static final String DB_NAME = "student_management";
    private static final int PORT = 1433;

    public static void main(String[] args) {
        var studentId = "B25DCCN100";
        var newGrade = 3.33;
        // cách 1:
//        int result = updateDataUsingStatement(studentId, newGrade);
        // cách 2:
        int result = updateDataUsingPreparedStatement(studentId, newGrade);

        if (result > 0) {
            System.out.println("Cập nhật điểm thành công!");
            var student = getStudentById(studentId);
            showStudentInfo(student);
        } else {
            System.out.println("Cập nhật điểm thất bại!");
        }
    }

    private static int updateDataUsingPreparedStatement(String studentId, double newGrade) {
        SQLServerDataSource dataSource = configDataSource();
        try (var conn = dataSource.getConnection()) {
            var sql = "UPDATE dbo.student SET average_grade = ? WHERE id = ?";
            var ps = conn.prepareStatement(sql);
            ps.setDouble(1, newGrade);
            ps.setString(2, studentId);
            return ps.executeUpdate();
        } catch (SQLServerException e) {
            e.printStackTrace();
            return -1;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    // hiển thị thông tin sinh viên
    private static void showStudentInfo(Student student) {
        System.out.printf("%-20s%-25s%-25s%-25s%-30s%-15s\n", "Mã SV",
                "Họ tên", "Địa chỉ", "Email", "Chuyên ngành", "Điểm TB");
        System.out.printf("%-20s%-25s%-25s%-25s%-30s%-15.2f", student.getId(),
                student.getName(), student.getAddress(), student.getEmail(),
                student.getMajor(), student.getAvgGrade());
    }

    /**
     * Đọc thông tin sinh viên từ cơ sở dữ liệu ra. Phương thức này truy vấn
     * thông tin sinh viên theo mã cho trước
     *
     * @param studentId mã sinh viên cần tìm
     * @return thông tin sinh viên nếu tìm thấy hoặc null trong trường hợp ngược lại
     */
    private static Student getStudentById(String studentId) {
        Student student = null;
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "SELECT * FROM dbo.student WHERE id = '" + studentId + "'";
            var statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                var id = resultSet.getString(1);
                var name = resultSet.getString(2);
                var address = resultSet.getString(3);
                var email = resultSet.getString(4);
                var major = resultSet.getString(5);
                var avgGrade = resultSet.getFloat(6);
                student = new Student(id, name, address, email, major, avgGrade);
            }
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return student;
    }

    /**
     * Phương thức sử dụng để cập nhật điểm sinh viên trong CSDL
     * theo mã sinh viên sử dụng Statement
     *
     * @param studentId mã sinh viên cần cập nhật trong bảng
     * @param value     giá trị điểm để cập nhật
     * @return số hàng bị ảnh hưởng bởi việc cập nhật này
     */
    private static int updateDataUsingStatement(String studentId, double value) {
        SQLServerDataSource dataSource = configDataSource();
        try (var conn = dataSource.getConnection()) {
            var sql = "UPDATE dbo.student SET average_grade = "
                    + value + " WHERE id = '" + studentId + "'";
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
