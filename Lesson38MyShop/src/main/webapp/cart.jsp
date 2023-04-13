<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Cart</title>
    <%@include file="headdata.jsp"%>
</head>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<jsp:include page="header.jsp"/>
<br>
<h2>Ваша корзина</h2>
<c:if test="${not empty myProducts}">
    <c:forEach items="${myProducts}" var="myProduct">
        <div class="container-fluid">
            <div class="row">
                <div class="col" style="background-color:white;height: auto;max-width: 200px">
                    <img src="${contextPath}/images/${myProduct.getImageName()}"
                         alt="${myProduct.getImageName()}" class="mx-auto d-block"
                         style="max-height: 100px;width: auto">
                </div>
                <div class="col" style="background-color:white;">
                    <p><b class="font-italic">Модель:</b> ${myProduct.getName()}</p>
                    <p><b class="font-italic">Описание:</b> ${myProduct.getDescription()}</p>
                    <p><b class="font-italic">Цена:</b> ${myProduct.getPrice()} руб.</p>
                    <form method="post" action="${pageContext.request.contextPath}/cart-post">
                        <input type="hidden" value="${myProduct.getId()}" name="id"/>
                        <input type="hidden" value="${myProduct.getImageName()}" name="imageName"/>
                        <input type="hidden" value="${myProduct.getName()}" name="name"/>
                        <input type="hidden" value="${myProduct.getDescription()}" name="description"/>
                        <input type="hidden" value="${myProduct.getPrice()}" name="price"/>
                        <input type="hidden" value="${myProduct.getCategoryId()}" name="categoryId"/>
                        <button type="submit" value="Delete" name="action" class="buttonDelete"><i
                                class="fa fa-minus-square fa-lg"></i> Удалить
                        </button>
                    </form>
                </div>
            </div>

        </div>
        <br>
    </c:forEach>
</c:if>
<c:if test="${empty myProducts}">
    <h3><p class="text-center">В корзине нет товаров</p></h3>
</c:if>
</body>
</html>