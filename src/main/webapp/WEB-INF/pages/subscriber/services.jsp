<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Services page</title>
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
            <h3>Services</h3>
            <br>
            <table border="1" cellspacing="0">
                <thead>
                <tr>
                    <th>Name</th>
                    <th>Description</th>
                    <th>Price</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="service" items="${all_services}">
                    <tr>
                        <td><c:out value="${service.name}"/></td>
                        <td><c:out value="${service.description}"/></td>
                        <td><c:out value="${service.price}"/></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
