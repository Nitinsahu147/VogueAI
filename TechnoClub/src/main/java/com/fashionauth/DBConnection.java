package com.fashionauth;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    // Credentials hidden for security. (Krish Patidar)
    private static final String URL = "DB_URL";
    private static final String USER = "DB_USER"; 
    private static final String PASSWORD = "DB_PASSWORD"; 

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
