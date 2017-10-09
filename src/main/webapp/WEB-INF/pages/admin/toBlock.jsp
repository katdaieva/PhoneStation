<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Admin | Debtors page</title>
</head>
<body>
<div class="site-block">
    <div class="header">
        <jsp:include page="/WEB-INF/pages/common/header.jsp"/>
    </div>

    <div class="content-block">
        <div class="menu">
            <jsp:include page="/WEB-INF/pages/admin/adminMenu.jsp"/>
        </div>

        <div class="main">
            <h3>To block</h3>
            <br>
            <table class="my-table" border="1" cellspacing="0">
                <thead>
                <tr>
                    <th>№</th>
                    <th>First name</th>
                    <th>Last name</th>
                    <th>Phone number</th>
                    <th>Balance</th>
                    <th>Is blocked</th>
                    <th>Bills</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="user" items="${toBlock}" varStatus="status" begin="0" step="1">
                    <tr>
                        <td><c:out value="${status.count}"/></td>
                        <td><c:out value="${user.firstName}"/></td>
                        <td><c:out value="${user.lastName}"/></td>
                        <td><c:out value="${user.phoneNumber}"/></td>
                        <td><c:out value="${user.balance}"/></td>
                        <td>
                            <c:choose>
                                <c:when test="${user.isBlocked()}">Yes</c:when>
                                <c:otherwise>No</c:otherwise>
                            </c:choose>
                        </td>
                        <td>
                            <a href="/station/bills?user_id=${user.id}">Show the bills</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
