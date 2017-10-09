package com.phonestation.controller;

import com.phonestation.commands.*;

import javax.servlet.Registration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "AppController", urlPatterns = "/station/*")
public class AppController extends HttpServlet {
//    @Override
//    public void init(ServletConfig config) throws ServletException {
////        urls.put("POST:/login", Login.getInstance());
////        urls.put("GET:/login", GetLoginPage.getInstance());
////        urls.put("POST:/adminHome", AdminHomepage.getInstance());
//
//        urls.put("POST:/profile", Profile.getInstance());
//        urls.put("POST:/users", Users.getInstance());
//        urls.put("POST:/new_users", NewUsers.getInstance());
//        urls.put("POST:/debtors", Debtors.getInstance());
//        urls.put("POST:/add_user", AddUser.getInstance());
//        urls.put("POST:/delete_user", DeleteUser.getInstance());
//        urls.put("POST:/bills", Bills.getInstance());
//        urls.put("POST:/login", Login.getInstance());
//        urls.put("POST:/logout", Logout.getInstance());
//        urls.put("POST:/registration", Registration.getInstance());
//        urls.put("POST:/services", Services.getInstance());
//        urls.put("POST:/replenish", Replenish.getInstance());
//        urls.put("POST:/pay", Pay.getInstance());
//
//        super.init(config);
//    }
//
//    private Map<String,Command> urls = new HashMap<>();
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        doCommand(req, resp);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        doCommand(req, resp);
//    }
//
//    protected void doCommand (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String method = request.getMethod().toUpperCase();
//        String path = request.getRequestURI();
//        path = path.replaceAll(".*/station", "").replaceAll("\\d+","");
//        String url = method + ":" + path;
//        Command command = urls.getOrDefault(url, (req, resp)->INDEX_PAGE);
//        String viewPage = command.execute(request,response);
//        request.getRequestDispatcher(viewPage)
//                .forward(request, response);
//    }
}