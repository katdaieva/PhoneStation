<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Admin | Profile page</title>
</head>
<body>
<div class="site-block">
    <div class="header">
        <jsp:include page="/WEB-INF/pages/common/header.jsp"/>
    </div>

    <div class="content-block">
        <jsp:include page="/WEB-INF/pages/admin/adminMenu.jsp"/>
    </div>

    <div class="main">
        <h3>Hello, ${user.name} ${user.surname}!</h3> <br>
        Users: ${user_count_info[0]} <br>
        Not connected: ${user_count_info[1]} <br>
        To block: ${user_count_info[2]}
    </div>

</div>
</body>
</html>