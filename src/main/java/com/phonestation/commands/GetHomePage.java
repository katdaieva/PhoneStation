package com.phonestation.commands;

import com.phonestation.model.entities.Account;
import com.phonestation.model.entities.Role;
import com.phonestation.model.entities.User;
import com.phonestation.services.AccountService;
import com.phonestation.services.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Optional;

public class GetHomePage implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        return null;
    }
   /* private AccountService accountService;
    private UserService userService;

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        Account currentAccount = (Account) req.getSession().getAttribute("account");
        if (currentAccount != null) {
            Optional<User> user = userService.getUserInfo(currentAccount.getLogin());
            if (currentAccount.getRole() == Role.ADMIN)
                return ADMIN_HOMEPAGE;
            if (currentAccount.getRole() == Role.SUBSCRIBER)
                return SUBSCRIBER_HOMEPAGE;
            else
                return LOGIN_PAGE;
        }
        else
            return LOGIN_PAGE;
    }

    private static class Holder {
        private static GetHomePage INSTANCE = new GetHomePage();
    }

    public static GetHomePage getInstance() {
        return GetHomePage.Holder.INSTANCE;
    }*/
}
