package jm.task.core.jdbc.util;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    private static String url = "jdbc:mysql://localhost:3306/users";
    private static String username = "root";
    private static String password = "root";

    public static Connection getConnection() {

        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }




}
