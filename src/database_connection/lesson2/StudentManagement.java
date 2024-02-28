package database_connection.lesson2;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.SQLException;

/**
 * Thêm dữ liệu vào bảng CSDL
 * Cú pháp: INSERT INTO [tên_bảng](danh_sách_cột_cần_chèn) VALUES(danh_sách_giá_trị_từng_cột)
 */
public class StudentManagement {
    private static final String USER = "sa";
    private static final String PASSWORD = "123";
    private static final String SERVER_NAME = "LAPTOP-LLTJI6NG\\SQLEXPRESS";
    private static final String DB_NAME = "student_management";
    private static final int PORT = 1433;

    public static void main(String[] args) {
        // cách 1: Statement
//        int result = insertDataUsingStatement();
//        if (result > 0) {
//            System.out.println("Thực hiện thành công lệnh truy vấn. " +
//                    result + " hàng đã được thêm vào trong bảng CSDL.");
//        } else {
//            System.out.println("Thực hiện câu lệnh truy vấn thất bại");
//        }


        // cách 2: PrepareStatement
        Student student = new Student("B25DCQT119", "Lê Hoàng Hiệp",
                "Hồ Chí Minh", "hiep@gmail.com",
                "Quản trị kinh doanh", 3.68f);
        int result = insertDataUsingPrepareStatement(student);
        if (result > 0) {
            System.out.println("Thực hiện thành công lệnh truy vấn. " +
                    result + " hàng đã được thêm vào trong bảng CSDL.");
        } else {
            System.out.println("Thực hiện câu lệnh truy vấn thất bại");
        }
    }

    private static int insertDataUsingPrepareStatement(Student student) {
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "INSERT INTO dbo.student(id, name, address, " +
                    "email, major,average_grade) VALUES(?, ?, ?, ?, ?, ?)";
            var prepareStm = conn.prepareStatement(sql);
            prepareStm.setString(1, student.getId());
            prepareStm.setString(2, student.getName());
            prepareStm.setString(3, student.getAddress());
            prepareStm.setString(4, student.getEmail());
            prepareStm.setString(5, student.getMajor());
            prepareStm.setFloat(6, student.getAvgGrade());

            return prepareStm.executeUpdate();
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
            return -1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return -1;
        }
    }

    private static int insertDataUsingStatement() {
        SQLServerDataSource dataSource = configDataSource();
        try (var conn = dataSource.getConnection()) {
            var sql = "INSERT INTO dbo.student  " +
                    "VALUES('B25DCCN110',N'Ngô Bảo An',N'Hà Nội','an@gmail.com',N'Công nghệ thông tin',3.66)";
            var statement = conn.createStatement();
            return statement.executeUpdate(sql);
        } catch (SQLServerException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static SQLServerDataSource configDataSource() {
        SQLServerDataSource dataSource = new SQLServerDataSource();
        dataSource.setUser(USER);
        dataSource.setPassword(PASSWORD);
        dataSource.setDatabaseName(DB_NAME);
        dataSource.setServerName(SERVER_NAME);
        dataSource.setPortNumber(PORT);
        dataSource.setTrustServerCertificate(true);
        return dataSource;
    }
}
