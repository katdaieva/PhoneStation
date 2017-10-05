package com.phonestation.dao;

import com.phonestation.entity.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class UserDAO extends DAOFactory implements GenericDAO<User> {
    private Connection connection;

    public UserDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void add(User object) throws SQLException {

    }

    @Override
    public List<User> getAll() throws SQLException {
        return null;
    }

    @Override
    public void update(User object) throws SQLException {

    }

    @Override
    public void remove(User object) throws SQLException {

    }

    /*    void addUser(User user);

    User getUserById(int id);
    User getUserByLogin(String login);
    User getUserByPhoneNumber(String phoneNumber);

    void deleteUser(int id);*/

}
