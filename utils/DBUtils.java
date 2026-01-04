package utils;

import java.sql.*;

public class DBUtils {
    private static Connection conn;

    public static Connection connectDB(String url, String user, String pass) throws SQLException {
        conn = DriverManager.getConnection(url, user, pass);
        return conn;
    }

    public static ResultSet runQuery(String query) throws SQLException {
        Statement st = conn.createStatement();
        return st.executeQuery(query);
    }

    public static void closeDB() throws SQLException {
        if(conn != null) conn.close();
    }
}
