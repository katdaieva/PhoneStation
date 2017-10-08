package com.phonestation.services;

import com.phonestation.model.dao.AccountDao;
import com.phonestation.model.dao.DaoFactory;
import com.phonestation.model.entities.Account;

import java.util.Optional;

public class AccountService {
    private DaoFactory daoFactory;

    private AccountService(DaoFactory instanse) {
        daoFactory = instanse;
    }

    public Optional<Account> login(String username, String password) {
        AccountDao dao = daoFactory.createAccountDAO();
        return Optional.ofNullable(dao.findByLogin(username));
    }

    private static class Holder {
        private static AccountService INSTANCE = new AccountService(DaoFactory.getInstanse());
    }

    public static AccountService getInstance() {
        return Holder.INSTANCE;
    }
}
