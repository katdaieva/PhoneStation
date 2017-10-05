package com.phonestation.service;

import com.phonestation.dao.AccountDAO;
import com.phonestation.dao.ConnectionUtil;
import com.phonestation.entity.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountService extends ConnectionUtil implements AccountDAO {
    Connection connection = getConnection();

    @Override
    public void addAccount(Account account) throws SQLException {
        PreparedStatement preparedStatement = null;
        String sql = "INSERT INTO accounts (id, login, password, role) VALUES (?, ?, ?, ?)";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, );

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

    @Override
    public Account getAccountByLogin(String login) {
        return null;
    }

    @Override
    public void deleteAccount(int accountId) {

    }
}
