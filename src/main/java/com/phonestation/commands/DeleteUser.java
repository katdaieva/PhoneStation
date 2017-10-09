package com.phonestation.commands;

import com.phonestation.services.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

public class DeleteUser implements Command {
    private UserService userService;

    public DeleteUser() {
        this.userService = UserService.getInstance();
    }

    public DeleteUser(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        int userId = Integer.parseInt(request.getParameter("user_id"));
        try {
            userService.deleteUser(userId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "redirect:/phone_station/new_users";
    }
}
