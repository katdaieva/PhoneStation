package com.phonestation.model.dao.jdbc;

import com.phonestation.model.dao.UserDao;
import com.phonestation.model.entities.User;

import java.sql.SQLException;
import java.util.List;

public class JdbcUserDao implements UserDao {
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

    }

    @Override
    public User findById(Integer id) throws SQLException {
        return null;
    }

    @Override
    public void close() throws Exception {

    }
}
