<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="form-styles.css" type="text/css">
</head>
<body>
<form action="login" class="decor" method="post">
    <div class="form-left-decoration"></div>
    <div class="form-right-decoration"></div>
    <div class="circle"></div>
    <div class="form-inner">
        <h3>Validation</h3>
        <input type="text" placeholder="Enter login" name="login">
        <input type="password" placeholder="Enter password" name="password">
        <input type="submit" value="Submit"/>
    </div>
</form>
</body>
</html>
