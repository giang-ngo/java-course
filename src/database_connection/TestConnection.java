package database_connection;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Kết nối đến SQL server
 */

public class TestConnection {
    public static void main(String[] args) {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setServerName("LAPTOP-LLTJI6NG\\SQLEXPRESS");
        ds.setUser("sa");
        ds.setPassword("123");
        ds.setPortNumber(1433);
        ds.setDatabaseName("Test");
        ds.setTrustServerCertificate(true);
        try (Connection connection = ds.getConnection()) {
            System.out.println("Kết nối thành công");
            System.out.println(connection.getCatalog());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
