<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Home page</title>
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <link rel="stylesheet" href="styles.css" type="text/css">
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Oswald:400,300" type="text/css">
</head>
<body>
<div>
    <a href="<c:url value="/students"/>" class="floating-button">Show all students</a>
</div>
<div>
    <a href="<c:url value="/addStudent"/>" class="floating-button">Add a new student</a>
</div>
<div>
    <a href="<c:url value="/delete"/>" class="floating-button">Remove student</a>
</div>
<div>
    <a href="<c:url value="/home" />" class="floating-button">Home</a>
</div>
<div>
    <a href="<c:url value="/login"/>" class="floating-button">Exit</a>
</div>
</body>
</html>
