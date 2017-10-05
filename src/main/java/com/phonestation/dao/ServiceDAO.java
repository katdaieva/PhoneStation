package com.phonestation.dao;

import com.phonestation.entity.Service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ServiceDAO extends DAOFactory implements GenericDAO<Service> {
    private Connection connection;

    public ServiceDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void add(Service object) throws SQLException {

    }

    @Override
    public List<Service> getAll() throws SQLException {
        return null;
    }

    @Override
    public void update(Service object) throws SQLException {

    }

    @Override
    public void remove(Service object) throws SQLException {

    }
/*    void addService(int userId, Service service);

    Service getService(int id);
    List<Service> getAllServices();
    List<Service> getUserServices(int userId);

    void deleteService(int userId, int serviceId);
    void deleteServices(int userId);*/
}
