<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/12/2021
  Time: 10:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="login1" method="post" modelAttribute="login">
    <h1>Login</h1>
    <h3>account</h3>
    <form:input path="account"></form:input>
    <h3>password</h3>
    <form:input path="password"></form:input>
    <button type="submit">login</button>
</form:form>
</body>
</html>
