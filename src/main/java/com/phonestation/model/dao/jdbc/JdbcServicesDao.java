package com.phonestation.model.dao.jdbc;

import com.phonestation.model.dao.ServicesDao;
import com.phonestation.model.entities.Services;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class JdbcServicesDao implements ServicesDao {
    private Connection connection;

    public JdbcServicesDao(Connection connection){
        this.connection = connection;
    }

    @Override
    public boolean add(Services object) throws SQLException {
        return false;
    }

    @Override
    public List<Services> getAll() throws SQLException {
        return null;
    }

    @Override
    public void update(Services object) throws SQLException {

    }

    @Override
    public void remove(Integer id) throws SQLException {

    }

    @Override
    public Services findById(Integer id) throws SQLException {
        return null;
    }

    @Override
    public void close() throws Exception {

    }
}
