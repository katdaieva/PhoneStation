package com.phonestation.model.dao.jdbc;

import com.phonestation.model.dao.BillDao;
import com.phonestation.model.entities.Bill;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class JdbcBillDao implements BillDao {
    private Connection connection;

    public JdbcBillDao(Connection connection){
        this.connection = connection;
    }

    @Override
    public boolean add(Bill object) throws SQLException {
        return false;
    }

    @Override
    public List<Bill> getAll() throws SQLException {
        return null;
    }

    @Override
    public void update(Bill object) throws SQLException {

    }

    @Override
    public void remove(Integer id) throws SQLException {

    }

    @Override
    public Bill findById(Integer id) throws SQLException {
        return null;
    }

    @Override
    public void close() throws Exception {

    }
}
