<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Login page</title>
</head>
<body>
<div class="site-block">
    <div class="site-block">
        <div class="header">
            <jsp:include page="/WEB-INF/pages/common/header.jsp"/>
        </div>

    <div class="content-block" style="display: flex">
        <div class="login-container">
            <form action="/station/login" method="POST">
                <input type="hidden" name="query" value="login"/>
                <table>
                    <tr>
                        <td colspan="2" align="center">
                            <h2>Authentification</h2>
                        </td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td colspan="2">"Login"</td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="text" name="login"></td>
                    </tr>
                    <tr>
                        <td colspan="2">"Password"</td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="password" name="password"></td>
                    </tr>
                    <tr>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit"
                                   value="Sign in">
                        </td>
                        <td style="text-align: right">
                            <a href="/station/registration">Sign up
                            </a>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>

</div>
</body>
</html>
