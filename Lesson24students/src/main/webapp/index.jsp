<%@ page import="by.tms.model.Student" %>
<%@ page import="by.tms.model.City" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" %>

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
    <%
        ArrayList<Student> students = (ArrayList<Student>) request.getAttribute("students");
        for (Student student : students) {
    %>
    <tr>
        <td><%=student.getId()%>
        </td>
        <td><%=student.getName()%>
        </td>
        <td><%=student.getSurname()%>
        </td>
        <td><%=student.getCourse()%>
        </td>
        <td><%=student.getCity().getName()%>
        </td>
    </tr>
    <%}%>
</table>
</body>
</html>
