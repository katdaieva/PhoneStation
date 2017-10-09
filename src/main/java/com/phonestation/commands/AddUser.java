package com.phonestation.commands;

import com.phonestation.services.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddUser implements Command {
    private UserService userService;

    public AddUser() {
        this.userService = UserService.getInstance();
    }

    public AddUser(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        int userId = Integer.parseInt(request.getParameter("user_id"));
        userService.updateIsRegistered(userId);
        return "redirect:/station/new_users";
    }


}
