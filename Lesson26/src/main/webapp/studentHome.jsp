<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <title>Home page</title>
    <link rel="stylesheet" href="style.css" type="text/css">
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Oswald:400,300" type="text/css">
</head>
<body>
<div>
    <a href="<c:url value="/students"/>">Show all students</a>
</div>
<div>
    <a href="<c:url value="/addStudent"/>">Add a new student</a>
</div>
<div>
    <a href="<c:url value="/delete"/>">Remove student</a>
</div>
<div>
    <a href="<c:url value="/home" />">Home</a>
</div>
<div>
    <a href="<c:url value="/login"/>">Exit</a>
</div>
<nav>
    <ul class="top-menu">
        <li><a href="<c:url value="/students"/>">SHOW ALL STUDENT</a></li>
        <li><a href="<c:url value="/addStudent" />">ADD A NEW STUDENT</a></li>
        <li><a href="/delete/">REMOVE A STUDENT</a></li>
        <li><a href="/home/">HOME</a></li>
        <li><a href="/login/">EXIT</a></li>
    </ul>
</nav>
</body>
</html>
