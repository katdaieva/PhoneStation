package com.phonestation.commands;

import com.phonestation.model.entities.User;
import com.phonestation.services.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class Debtors implements Command {
    private UserService userService;

    public Debtors() {
        this.userService  = UserService.getInstance();
    }

    public Debtors(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return null;
    }
}
