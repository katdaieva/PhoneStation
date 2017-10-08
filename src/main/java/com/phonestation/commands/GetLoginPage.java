package com.phonestation.commands;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GetLoginPage implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        return null;
    }

    private static class Holder {
        private static GetLoginPage INSTANCE = new GetLoginPage();
    }

    public static GetLoginPage getInstance() {
        return GetLoginPage.Holder.INSTANCE;
    }
}
