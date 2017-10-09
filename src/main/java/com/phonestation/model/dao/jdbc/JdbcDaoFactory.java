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
        return new JdbcAccountDao(getConnection());
    }

    @Override
    public BillDao createBillDAO() {
        return new JdbcBillDao(getConnection());
    }

    @Override
    public ServicesDao createServiceDAO() {
        return new JdbcServicesDao(getConnection());
    }

    @Override
    public UserDao createUserDAO() {
        return new JdbcUserDao(getConnection());
    }
}
