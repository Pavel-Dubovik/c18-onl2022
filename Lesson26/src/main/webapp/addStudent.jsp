<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title>Add student</title>
</head>
<body>
<form method="post" action="addStudent" accept-charset="UTF-8">
  Enter name:<input type="text" name="name"/><br>
  Enter surname:<input type="text" name="surname"/><br>
  Enter course:<input type="text" name="course"/><br>
  Enter city:<input type="text" name="city"/><br>
  <br>
  <input type="submit" value="Add student">
</form>
<div>
  <a href="<c:url value="/studentHome"/>">
    <span>Return</span>
  </a>
</div>
</body>
</html>
