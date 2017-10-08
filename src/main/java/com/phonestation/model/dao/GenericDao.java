package com.phonestation.model.dao;

import java.sql.SQLException;
import java.util.List;

public interface GenericDao<T> extends AutoCloseable {
    boolean add(T object) throws SQLException;
    List<T> getAll() throws SQLException;
    void update(T object) throws SQLException;
    void remove(Integer id) throws SQLException;
    T findById(Integer id) throws SQLException;
}
