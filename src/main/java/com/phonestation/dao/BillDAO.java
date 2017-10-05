package com.phonestation.dao;

import com.phonestation.entity.Bill;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BillDAO extends DAOFactory implements GenericDAO<Bill> {
    /*    void addBill(int userId, Bill bill);

    Bill getBill(int id);
    List<Bill> getBills(int userId);

    void updateIsPaid(int id, boolean isPaid);

    void deleteBills(int userId);*/

    private Connection connection;

    public BillDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void add(Bill object) throws SQLException {

    }

    @Override
    public List<Bill> getAll() throws SQLException {
        return null;
    }

    @Override
    public void update(Bill object) throws SQLException {

    }

    @Override
    public void remove(Bill object) throws SQLException {

    }

}
