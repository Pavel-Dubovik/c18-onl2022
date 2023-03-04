<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Home</title>
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <link rel="stylesheet" href="styles.css" type="text/css">
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Oswald:400,300" type="text/css">
</head>
<body>
<h2>Home page</h2>
<div>
    <a href="<c:url value="/studentHome" />" class="floating-button">Students</a>
</div>
<div>
    <a href="<c:url value="/login" />" class="floating-button">Exit</a>
</div>
</body>
</html>
