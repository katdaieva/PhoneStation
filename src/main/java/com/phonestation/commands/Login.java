package com.phonestation.commands;

import com.phonestation.model.entities.Account;
import com.phonestation.services.AccountService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

import static com.phonestation.view.Constants.PARAM_LOGIN;
import static com.phonestation.view.Constants.PARAM_PASSWORD;
import static com.phonestation.view.Constants.UNABLE_TO_LOGIN;

public class Login implements Command {
    private AccountService accountService;

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String login = req.getParameter(PARAM_LOGIN);
        String password = req.getParameter(PARAM_PASSWORD);
        if(login != null && password != null) {
            Optional<Account> account = accountService.login(login, password);
            if (account.isPresent()){
                req.getSession().setAttribute("login", account.get());
                return GetHomePage.getInstance().execute(req, res);
            }
        }
        req.setAttribute("unable to login", UNABLE_TO_LOGIN);
        return GetLoginPage.getInstance().execute(req, res);
    }

    private Login() {
        accountService = AccountService.getInstance();
    }

    private static class Holder {
        private static Login INSTANCE = new Login();
    }

    public static Login getInstance() {
        return Login.Holder.INSTANCE;
    }
}
