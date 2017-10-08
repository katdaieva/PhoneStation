package com.phonestation.model.dao;

import com.phonestation.model.entities.Account;

public interface AccountDao extends GenericDao<Account> {
    Account findByLogin(String login);
}

