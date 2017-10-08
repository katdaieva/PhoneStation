package com.phonestation.commands;

import com.phonestation.services.AccountService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GetHomePage implements Command {
    private AccountService accountService;

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        return null;
    }

    private static class Holder {
        private static GetHomePage INSTANCE = new GetHomePage();
    }

    public static GetHomePage getInstance() {
        return GetHomePage.Holder.INSTANCE;
    }
}
