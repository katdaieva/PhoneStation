package com.phonestation.controller;

import com.phonestation.commands.Command;
import com.phonestation.commands.GetHomePage;
import com.phonestation.commands.GetLoginPage;
import com.phonestation.commands.Login;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.phonestation.view.Constants.INDEX_PAGE;

@WebServlet(name = "AppController", urlPatterns = "/station/*")
public class AppController extends HttpServlet {
    private Map<String,Command> urls = new HashMap<>();

    @Override
    public void init(ServletConfig config) throws ServletException {
        urls.put("POST:/login", Login.getInstance());
        urls.put("GET:/login", GetLoginPage.getInstance());

        urls.put("GET:/home", GetHomePage.getInstance());

        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doCommand(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doCommand(req, resp);
    }

    protected void doCommand (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getMethod().toUpperCase();
        String path = request.getRequestURI();
        path = path.replaceAll(".*/station", "").replaceAll("\\d+","");
        String url = method + ":" + path;
        Command command = urls.getOrDefault(url, (req, resp)->INDEX_PAGE);
        String viewPage = command.execute(request,response);
        request.getRequestDispatcher(viewPage)
                .forward(request, response);
    }
}