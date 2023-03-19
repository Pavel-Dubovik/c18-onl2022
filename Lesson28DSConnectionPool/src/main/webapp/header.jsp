<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Header</title>
</head>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<ul>
    <li><a class="active" href='${contextPath}/home'><i class="fa fa-fw fa-home"></i> Главная</a></li>
    <li style="float:right"><a href='${contextPath}/cart'><i class="fa fa-fw fa-shopping-cart"></i> Корзина</a></li>
    <li style="float:right"><a href='profile.jsp'><i class="fa fa-fw fa-user"></i> Пользователь</a></li>
</ul>
</body>
</html>