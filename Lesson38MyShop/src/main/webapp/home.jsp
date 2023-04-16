<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Home page</title>
  <%@include file="headdata.jsp"%>
</head>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<jsp:include page="header.jsp"/>
<%--<%@include file="header.jsp"%>--%>
<br>
<h2>Popular categories</h2>
<div class="container-fluid">
  <c:if test="${not empty categories}">
    <div class="row">
      <c:forEach items="${categories}" var="category">
        <div class="card w-25 m-1" type="category">
          <div class="card-body">
              ${category.getName()}
            <a href="${contextPath}/my-shop?command=category&categoryId=${category.getId()}&nameCategory=${category.getName()}">
              <img class="card-img"
                   style="width:150px;height:120px"
                   src="${contextPath}/images/${category.getImageName()}"
                   alt="Card image">
            </a>
          </div>
        </div>
      </c:forEach>
    </div>
  </c:if>
</div>
</body>
</html>