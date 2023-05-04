<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Products by category</title>
    <%@include file="headdata.jsp" %>
</head>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<jsp:include page="header.jsp"/>
<br>
<h2>${nameCategory}</h2><br>
<div class="container-fluid">
    <c:if test="${not empty products}">
        <c:forEach items="${products}" var="product">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-1" style="background-color:white;">
                        <a href="${contextPath}/my-shop?command=product&productId=${product.getId()}">
                            <img src="${contextPath}/images/${product.getImageName()}"
                                 alt="${product.getImageName()}" class="responsive"></a></div>
                    <div class="col" style="background-color:white;">
                        <p><b class="font-italic">Модель:</b> ${product.getName()}</p>
                        <p><b class="font-italic">Описание:</b> ${product.getDescription()}</p>
                        <p><b class="font-italic">Цена:</b> ${product.getPrice()} руб.</p>
                    </div>
                </div>
            </div>
            <br>
        </c:forEach>
    </c:if>
</div>
</body>
</html>