<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Add student</title>
    <link rel="stylesheet" href="form2-styles.css" type="text/css">
</head>
<body>
<form method="post" action="addStudent">
    <div class="form">
        <div class="title">Add student</div>
        <div class="input-container ic1">
            <input id="firstname" class="input" type="text" placeholder=" " name="name"/>
            <div class="cut"></div>
            <label for="firstname" class="placeholder">First name</label>
        </div>
        <div class="input-container ic2">
            <input id="lastname" class="input" type="text" placeholder=" " name="surname"/>
            <div class="cut"></div>
            <label for="lastname" class="placeholder">Last name</label>
        </div>
        <div class="input-container ic2">
            <input id="course" class="input" type="text" placeholder=" " name="course"/>
            <div class="cut cut-short"></div>
            <label for="course" class="placeholder">Course</label>
        </div>
        <div class="input-container ic2">
            <input id="city" class="input" type="text" placeholder=" " name="city"/>
            <div class="cut cut-short"></div>
            <label for="city" class="placeholder">City</label>
        </div>
        <button type="text" class="submit">Add student</button>
        <a href="<c:url value="/studentHome"/>" class="submit">Return</a>
    </div>
</form>
</body>
</html>
