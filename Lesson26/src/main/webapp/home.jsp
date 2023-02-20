<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Home</title>
</head>
<body>
<h2>Home page</h2>
<div>
    <a href="<c:url value="/studentHome" />">Students</a>
</div>
<div>
    <a href="<c:url value="/login" />">Exit</a>
</div>
</body>
</html>
