package com.phonestation.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOFactory {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/phone_station";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "root";

    private Connection connection;

    public DAOFactory() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println(connection.getCatalog());
            System.out.println(connection.getSchema());
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public AccountDAO getAccountDAO() {
        return new AccountDAO(connection);
    }
    public BillDAO getBillDAO() {
        return new BillDAO(connection);
    }
    public ServiceDAO getServiceDAO() {
        return new ServiceDAO(connection);
    }
    public UserDAO getUserDAO() {
        return new UserDAO(connection);
    }
}
