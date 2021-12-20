<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/12/2021
  Time: 6:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/sandwich" >
    <input type="checkbox" name="name" value="tomaro">tomaro
    <input type="checkbox" name="name" value="tomaro1">tomaro1
    <input type="checkbox" name="name" value="tomaro2">tomaro2
    <input type="checkbox" name="name" value="tomaro3">tomaro3
<input type="submit" value="save">
</form>
<c:forEach var="index" items="${btsandwich}">
    <p>${index}</p>
</c:forEach>
</body>
</html>
