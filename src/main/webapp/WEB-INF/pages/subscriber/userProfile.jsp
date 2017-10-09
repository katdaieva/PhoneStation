<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>User profile page</title>
</head>
<body>
<div class="site-block">
    <div class="header">
        <jsp:include page="/WEB-INF/pages/common/header.jsp"/>
    </div>

    <div class="content-block">
        <div class="menu">
            <jsp:include page="/WEB-INF/pages/subscriber/userMenu.jsp"/>
        </div>

        <div class="main">
            <h3>Profile</h3>
            <br>
            First name: ${user.name}<<br>
            Last name: ${user.lastName}<br>
            Phone number: ${user.phoneNumber}<br>
            Balance: ${user.balance}<br>
            Is blocked: <c:choose>
                            <c:when test="${user.isBlocked()}">yes</c:when>
                            <c:otherwise>no</c:otherwise>
                        </c:choose>
        </div>
    </div>
</div>
</body>
</html>
