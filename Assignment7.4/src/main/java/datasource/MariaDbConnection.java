package datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDbConnection {
    private static Connection conn = null;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection(
                        "jdbc:mariadb://127.0.0.1:3306/Currency",
                        "root",
                        "password");
            } catch (SQLException e) {
                System.out.println("Database connection failed.");
                return null;
            }
        }
        return conn;
    }

    public static void terminate() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
