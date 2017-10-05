package com.phonestation.dao;

import com.phonestation.entity.Account;
import com.phonestation.entity.Role;

import javax.persistence.criteria.CriteriaBuilder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AccountDAO extends DAOFactory implements GenericDAO<Account> {
/*    void addAccount(Account account) throws SQLException;
    Account getAccountByLogin(String login);
    void deleteAccount(int accountId);*/
    private Connection connection;

    public AccountDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void add(Account account) throws SQLException {
        String sql = "INSERT INTO accounts (login, password, role) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, account.getLogin());
            preparedStatement.setString(2, account.getPassword());
            preparedStatement.setString(3, String.valueOf(account.getRole()));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Account getAccountByLogin(String login) {
        String sql = "SELECT * FROM accounts WHERE login = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, login);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                int id  = rs.getInt("id");
                String password = rs.getString("password");
                Role role = Role.valueOf(rs.getString("role"));
                return Account.builder()
                        .id(id)
                        .login(login)
                        .password(password)
                        .role(role)
                        .build();
            }
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Account> getAll() throws SQLException {
        return null;
    }

    @Override
    public void update(Account object) throws SQLException {

    }

    @Override
    public void remove(Account account) throws SQLException {

    }

    public void remove(int accountId) throws SQLException {
        String sql = "DELETE FROM accounts WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, accountId);
            ResultSet rs = preparedStatement.executeQuery();
            /*if (rs.next()) {
                int id  = rs.getInt("id");
                String password = rs.getString("password");
                Role role = Role.valueOf(rs.getString("role"));
                return Account.builder()
                        .id(id)
                        .login(login)
                        .password(password)
                        .role(role)
                        .build();
            }*/
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

// Сервисы вызываем через DependencyInjection

