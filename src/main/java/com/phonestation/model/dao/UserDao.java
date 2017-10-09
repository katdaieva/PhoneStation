package com.phonestation.model.dao;

import com.phonestation.model.entities.User;

import java.util.List;

public interface UserDao extends GenericDao<User> {
    User findByAccountId(Integer accountId);
    User findByLogin(String login);
    void updIsRegistered(int userId);
    void updIsBlocked(int userId, boolean isBlocked);
    //List<User> getDebtors();
}
