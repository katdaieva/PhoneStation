<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login page</title>
</head>
<body>
    <form action="/station/login" method="post">
        <input type="text" name="login"/>
        <input type="password" name = "password"/>
        <input type="submit" value="Log in!">
    </form>
</body>
</html>
