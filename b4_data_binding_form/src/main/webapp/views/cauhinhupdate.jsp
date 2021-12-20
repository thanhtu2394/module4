<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/12/2021
  Time: 6:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>update</h1>
<form:form action="cauhinhpost" method="post" modelAttribute="Cauhinh"></br>
    <form:select path="langague" items="${languge}"></form:select></br>
    <form:select path="size" items="${size}"></form:select></br>
    <form:checkbox path="fillter" value="enable"></form:checkbox>enable fillter</br>
    <form:textarea path="signature"></form:textarea></br>
    <button type="submit">update</button>
    <button type="reset">cancel</button>
</form:form>
</body>
</html>
