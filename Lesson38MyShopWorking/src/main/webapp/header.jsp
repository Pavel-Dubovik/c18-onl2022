<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Header</title>
</head>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<ul>
    <Li><a class="active" href='<c:url value="/my-shop?command=home-get"/>'>Главная</a></li>
    <li style="float:right"><a href='${contextPath}/my-shop?command=cart-get'><i class="fa fa-fw fa-shopping-cart"></i>
        Корзина</a></li>
</ul>
</body>
</html>