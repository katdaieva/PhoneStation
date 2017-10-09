<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Registration page</title>
</head>
<body>
<div class="site-block">
    <div class="site-block">
        <div class="header">
            <jsp:include page="/WEB-INF/pages/common/header.jsp"/>
        </div>

    <div class="content-block" style="display: flex">
        <div class="registration-container">
            <form action="/station/registration" method="POST">
                <table>
                    <tr>
                        <td colspan="2" align="center">Registration</h2>
                        </td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td>First name</td>
                    </tr>
                    <tr>
                        <td><input type="text" name="firstName" value=${firstName}></td>
                    </tr>
                    <tr>
                        <td>Last name</td>
                    </tr>
                    <tr>
                        <td><input type="text" name="lastName" value=${lastName}></td>
                    </tr>
                    <tr>
                        <td>Phone number</td>
                    </tr>
                    <tr>
                        <td><inputtype="text" name="phoneNumber" value=${phoneNumber}></td>
                    </tr>
                    <tr>
                        <td>Login</td>
                    </tr>
                    <tr>
                        <td><input type="text" name="login" value=${login}></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                    </tr>
                    <tr>
                        <td><input type="password" name="password" value="${password}"></td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center">
                            <input type="submit" value="Sign up">
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>

</div>
</body>
</html>