<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/12/2021
  Time: 6:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="maytinh1" method="post">
    <input type="number" name="num1">
    <input type="number" name="num2"><br>
    <button type="submit" name="dau" value="1">daucong</button>
  <button type="submit" name="dau" value="2">dautru</button>
  <button type="submit" name="dau" value="3">daunhan</button>
  <button type="submit" name="dau" value="4">dauchia</button>
</form>
<p>Result :${total}</p>
</body>
</html>
