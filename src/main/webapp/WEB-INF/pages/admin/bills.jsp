<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Admin | Bills</title>
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
            <h3>Bills</h3>
            <br>

            <div style="float: left; width: 40%">
                <table align="left">
                    <tr>
                        <td>User: </td>
                        <td>${subscriber.firstName} ${subscriber.lastName}</td>
                    </tr>
                    <tr>
                        <td>Phone number: </td>
                        <td>${subscriber.phoneNumber}</td>
                    </tr>
                    <tr>
                        <td>Debt: </td>
                        <td>${debt}</td>
                    </tr>
                    <tr>
                        <td>Is blocked: </td>
                        <td>
                            <c:choose>
                                <c:when test="${subscriber.isBlocked()}">Yes</c:when>
                                <c:otherwise>No</c:otherwise>
                            </c:choose>
                        </td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center">
                            <c:choose>
                                <c:when test="${subscriber.isBlocked()}">
                                    <form action="/station/unblock_user?user_id=${subscriber.id}" method="POST">
                                        <input type="submit" value="Unblock">
                                    </form>
                                </c:when>
                                <c:otherwise>
                                    <form action="/station/block_user?user_id=${subscriber.id}" method="POST">
                                        <input type="submit" value="Block">
                                    </form>
                                </c:otherwise>
                            </c:choose>
                        </td>
                    </tr>
                </table>
            </div>

            <div style="float: right; width: 60%">
                <table border="1" cellspacing="0">
                    <thead>
                    <tr>
                        <th>Date</th>
                        <th>Description</th>
                        <th>Price</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="bill" items="${subscriber.invoices}">
                        <tr>
                            <td><c:out value="${invoice.dateTime}"/></td>
                            <td><c:out value="${invoice.description}"/></td>
                            <td><c:out value="${invoice.price}"/></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>
