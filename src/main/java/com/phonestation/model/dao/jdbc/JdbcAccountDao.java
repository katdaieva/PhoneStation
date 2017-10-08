package com.phonestation.model.dao.jdbc;

import com.phonestation.model.dao.AccountDao;
import com.phonestation.model.entities.Account;
import com.phonestation.utils.EntityRetriever;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcAccountDao implements AccountDao {
    public static final String SELECT_BY_LOGIN = "SELECT * FROM accounts WHERE login = ?";

    private Connection connection;

    public JdbcAccountDao(Connection connection){
        this.connection = connection;
    }

    @Override
    public Account findByLogin(String login) {
        Account account = null;
        try(PreparedStatement statement = connection.prepareStatement(SELECT_BY_LOGIN)) {
            statement.setString(1, login);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                account = EntityRetriever.retrieveAccount(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return account;
    }

    @Override
    public boolean add(Account object) throws SQLException {
        return false;
    }

    @Override
    public List<Account> getAll() throws SQLException {
        return null;
    }

    @Override
    public void update(Account object) throws SQLException {

    }

    @Override
    public void remove(Integer id) throws SQLException {

    }

    @Override
    public Account findById(Integer id) throws SQLException {
        return null;
    }

    @Override
    public void close() throws Exception {

    }
}
