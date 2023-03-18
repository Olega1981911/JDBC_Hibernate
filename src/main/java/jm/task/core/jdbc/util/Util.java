package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306";
        String username = "root";
        String password = "root";
        // реализуйте настройку соеденения с БД
        Connection connection;
        try {
            connection = DriverManager.getConnection(url, username, password);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }
}
