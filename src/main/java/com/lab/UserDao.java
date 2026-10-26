package com.lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDao {

    private static final String PASSWORD = "admin123";

    public boolean findUser(String username) throws Exception {
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/app", "root", PASSWORD);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(
                "SELECT * FROM users WHERE name = '" + username + "'");
        if (username == null) {
            throw new Exception("Invalid input");
        }
        return rs.next();
    }
}
