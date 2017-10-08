package com.phonestation.model.dao.jdbc;

import com.phonestation.model.dao.*;
import com.phonestation.utils.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDaoFactory extends DaoFactory {
    Connection getConnection() {
        Config config = Config.getInstance();
        Connection connection;
        try {
            connection = DriverManager.getConnection(config.getUrl(), config.getUsername(), config.getPassword());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    @Override
    public AccountDao createAccountDAO() {
        return null;
    }

    @Override
    public BillDao createBillDAO() {
        return null;
    }

    @Override
    public ServicesDao createServiceDAO() {
        return null;
    }

    @Override
    public UserDao createUserDAO() {
        return null;
    }
}
