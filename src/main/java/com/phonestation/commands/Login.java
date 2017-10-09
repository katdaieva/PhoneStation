package com.phonestation.commands;

import com.phonestation.model.entities.User;
import com.phonestation.services.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

public class Login implements Command {
    private UserService userService;

    public Login() {
        this.userService = UserService.getInstance();
    }

    public Login(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        User sessionUser = (User) request.getSession().getAttribute("user");
        if (sessionUser != null) {
            return "redirect:/station/profile";
        }
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        Optional<User> user = userService.getUserInfo(login);
        if (user.isPresent()) {
            return LOGIN_PAGE;
        }
        request.getSession().setAttribute("user", user);
        return "redirect:/station/profile";
    }
}
