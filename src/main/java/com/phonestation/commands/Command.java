package com.phonestation.commands;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public interface Command {
    String PAY_PAGE = "/WEB-INF/pages/subscriber/replenish.jsp";
    String ADMIN_PROFILE_PAGE = "/WEB-INF/pages/admin/adminProfile.jsp";
    String DEBTORS_PAGE = "/WEB-INF/pages/admin/toBlock.jsp";
    String BILLS_PAGE = "/WEB-INF/pages/subscriber/bills.jsp";
    String LOGIN_PAGE = "/WEB-INF/pages/common/login.jsp";
    String NEW_USERS_PAGE = "/WEB-INF/pages/admin/notConnected.jsp";
    String REGISTRATION_PAGE = "/WEB-INF/pages/common/addUser.jsp";
    String SERVICES_PAGE = "/WEB-INF/pages/subscriber/services.jsp";
    String SUCCESSFUL_REGISTRATION_PAGE = "/WEB-INF/pages/common/addedUser.jsp";
    String USER_INVOICES_PAGE = "/WEB-INF/pages/admin/bills.jsp";
    String USER_PROFILE_PAGE = "/WEB-INF/pages/subscriber/userProfile.jsp";
    String USERS_PAGE = "/WEB-INF/pages/admin/users.jsp";

    String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException;
}
