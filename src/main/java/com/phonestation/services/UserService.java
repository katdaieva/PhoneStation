package com.phonestation.services;

import com.phonestation.model.dao.DaoFactory;
import com.phonestation.model.dao.UserDao;
import com.phonestation.model.entities.User;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class UserService {
    private DaoFactory daoFactory;

    private UserService(DaoFactory instanse) {
        daoFactory = instanse;
    }

    public Optional<User> getUserInfo(String login) {
        UserDao dao = daoFactory.createUserDAO();
        Optional<User> user = Optional.ofNullable(dao.findByLogin(login));
        return user;
    }

    public void updateIsRegistered(int userId) {
        UserDao dao = daoFactory.createUserDAO();
        dao.updIsRegistered(userId);
    }

    public void updateIsBlocked(int userId, boolean isBlocked) {
        UserDao dao = daoFactory.createUserDAO();
        dao.updIsBlocked(userId, isBlocked);
    }

    public void deleteUser(int userId) throws SQLException {
        UserDao dao = daoFactory.createUserDAO();
        try {
            dao.remove(userId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> getDebtors(){
        return null;
    }

    private static class Holder {
        private static UserService INSTANCE = new UserService(DaoFactory.getInstanse());
    }

    public static UserService getInstance() {
        return UserService.Holder.INSTANCE;
    }
}
