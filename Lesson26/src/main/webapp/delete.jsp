<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Delete student</title>
</head>
<body>
<form action="delete" method="post">
    Enter student id:<input type="text" name="id"/>
    <br><br>
    <input type="submit" value="DELETE">
</form>
<a href='<c:url value="/studentHome" />'>Return</a>
</body>
</html>
