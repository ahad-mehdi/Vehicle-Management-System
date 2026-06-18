import java.sql.*;

public class DatabaseManager {

    private static final String URL =
            "jdbc:mysql://localhost:3306/vehicle_management";

    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection connect() {

        try {

            return DriverManager.getConnection(
                    URL, USER, PASSWORD);

        } catch (SQLException e) {

            System.out.println("Database Connection Failed");

            return null;
        }
    }

    public static void createTable() {

        String sql = "CREATE TABLE IF NOT EXISTS vehicles ("
                + "id INT AUTO_INCREMENT PRIMARY KEY,"
                + "type VARCHAR(50),"
                + "make VARCHAR(50),"
                + "model VARCHAR(50),"
                + "year INT,"
                + "registration VARCHAR(50),"
                + "extra VARCHAR(50))";

        try {

            Connection conn = connect();

            if(conn == null) {
                return;
            }

            Statement stmt = conn.createStatement();

            stmt.execute(sql);

            conn.close();

            System.out.println("Table Created Successfully!");

        } catch (SQLException e) {

            System.out.println("Table Creation Failed");
        }
    }
}