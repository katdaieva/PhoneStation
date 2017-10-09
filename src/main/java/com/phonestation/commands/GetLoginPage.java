package com.phonestation.commands;

import com.phonestation.model.entities.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class GetLoginPage implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        return null;
    }
//    private GetLoginPage(){}
//
//    @Override
//    public String execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//        if ((User)req.getSession().getAttribute("login") != null)
//            return GetHomePage.getInstance().execute(req, res);
//        return LOGIN_PAGE;
//    }
//
//    private static class Holder {
//        private static GetLoginPage INSTANCE = new GetLoginPage();
//    }
//
//    public static GetLoginPage getInstance() {
//        return GetLoginPage.Holder.INSTANCE;
//    }
}
