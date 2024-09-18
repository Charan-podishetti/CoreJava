package com.evergent.shadow.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class InventoryDBConnection {

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/inventorydb",
            "root",
            "password");
        return conn;
    }
}