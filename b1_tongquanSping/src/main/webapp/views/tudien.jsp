<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 17/11/2021
  Time: 7:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>tudien</title>
</head>
<body>
<div class="center-pill">
    <h1 style="color: blue"> TRA TU DIEN</h1>
    <br>
    <form action="/tudien" method="post" >
        <input type="text" name="name" >
        <input type="submit" value="tracuu">
    </form>

    <h3>RESULT : ${result} </h3>


</div>

</body>
</html>
