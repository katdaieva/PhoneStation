package com.phonestation.commands;

import com.phonestation.services.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BlockUser implements Command{
    private UserService userService;

    public BlockUser() {
        this.userService = UserService.getInstance();
    }

    public BlockUser(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        int userId = Integer.parseInt(request.getParameter("user_id"));
        userService.updateIsBlocked(userId, true);
        return "redirect:/station/user_bills?user_id=" + userId;
    }
}
