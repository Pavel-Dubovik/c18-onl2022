<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Students</title>
</head>
<body>
<h1>Students List</h1>
<table border="1">
    <caption>Таблица студентов</caption>
    <tr>
        <th>id</th>
        <th>Имя</th>
        <th>Фамилия</th>
        <th>Курс</th>
        <th>Город</th>
    </tr>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.surname}</td>
            <td>${student.course}</td>
            <td>${student.city.name}</td>
        </tr>
    </c:forEach>
</table>
<div>
    <a href="<c:url value="/studentHome"/>">Return</a>
</div>
</body>
</html>
