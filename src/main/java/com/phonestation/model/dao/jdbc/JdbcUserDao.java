package com.phonestation.model.dao.jdbc;

import com.phonestation.model.dao.UserDao;
import com.phonestation.model.entities.User;
import com.phonestation.utils.EntityRetriever;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcUserDao implements UserDao {
    public static final String SELECT_BY_ACCOUNT_ID = "SELECT * FROM users WHERE account_id = ?";
    public static final String SELECT_BY_LOGIN = "SELECT users.* FROM users JOIN accounts WHERE accounts.login = ?";
    public static final String UPDATE_IS_REGISTERED = "UPDATE users SET is_connected = TRUE WHERE users.account_id = ?";
    public static final String UPDATE_IS_BLOCKED = "UPDATE users SET is_blocked = ? WHERE account_id = ?";
    //public static final String GET_DEBTORS = "SELECT *, sum(price) AS debt FROM users INNER JOIN accounts ON account_id = accounts.id INNER JOIN bills ON users.id = user_id WHERE is_paid = 0 GROUP BY user_id ORDER BY debt DESC";
    public static final String DELETE_BY_ACCOUNT_ID = "DELETE FROM users WHERE account_id = ?";

    private Connection connection;

    public JdbcUserDao(Connection connection){
        this.connection = connection;
    }

    @Override
    public boolean add(User object) throws SQLException {
        return false;
    }

    @Override
    public List<User> getAll() throws SQLException {
        return null;
    }

    @Override
    public void update(User object) throws SQLException {

    }

    @Override
    public void remove(Integer id) throws SQLException {
        User user = null;
        try (PreparedStatement statement = connection.prepareStatement(DELETE_BY_ACCOUNT_ID)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                user = EntityRetriever.retrieveUser(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User findById(Integer id) throws SQLException {
        return null;
    }

    @Override
    public void close() throws Exception {

    }

    @Override
    public User findByAccountId(Integer accountId) {
        User user = null;
        try (PreparedStatement statement = connection.prepareStatement(SELECT_BY_ACCOUNT_ID)) {
            statement.setInt(1, accountId);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                user = EntityRetriever.retrieveUser(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public User findByLogin(String login) {
        User user = null;
        try (PreparedStatement statement = connection.prepareStatement(SELECT_BY_LOGIN)) {
            statement.setString(1, login);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                user = EntityRetriever.retrieveUser(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void updIsRegistered(int userId) {
        User user = null;
        try (PreparedStatement statement = connection.prepareStatement(UPDATE_IS_REGISTERED)) {
            statement.setInt(1, userId);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                user = EntityRetriever.retrieveUser(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updIsBlocked(int userId, boolean isBlocked) {
        User user = null;
        try (PreparedStatement statement = connection.prepareStatement(UPDATE_IS_BLOCKED)) {
            statement.setBoolean(1, isBlocked);
            statement.setInt(2, userId);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                user = EntityRetriever.retrieveUser(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
