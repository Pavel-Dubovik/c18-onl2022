<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Login form</title>
    <%@include file="headdata.jsp" %>
</head>
<body>
<div class="container">
    <div class="col-md-8 offset-md-4">
        <h2>Login</h2>
        <p>Please, enter your credentials</p>
        <form method="post" action="<c:url value="/my-shop?command=home-post"/> ">
            <div class="form-group">
                <label for="username">Username:</label>
                <input type="text" class="form-control w-25" id="username" placeholder="Enter username" name="username"
                       required>
                <div class="invalid-feedback">Username should be entered!</div>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" class="form-control w-25" id="password" placeholder="Enter password"
                       name="password"
                       required>
                <div class="invalid-feedback">Password should be entered!</div>
            </div>
            <button type="submit" class="btn btn-primary">Login</button>
        </form>
    </div>
</div>
</body>
</html>