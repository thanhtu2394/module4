<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/12/2021
  Time: 10:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px solid">
    <tr>
        <th>account</th>
        <th>password</th>
        <th>name</th>
        <th>email</th>
        <th>tuoi</th>
    </tr>
    <tr>
        <td>${user.account}</td>
        <td>${user.password}</td>
        <td>${user.name}</td>
        <td>${user.email}</td>
        <td>${user.age}</td>
    </tr>
</table>
</body>
</html>
