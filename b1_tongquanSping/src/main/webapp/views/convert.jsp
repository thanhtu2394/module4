<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 17/11/2021
  Time: 6:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert USD to Vnd</title>
</head>
<body>
<div class="center-pill">
    <h1 style="color: blue"> Convert USD to VND</h1>
    <h6> USD= 23000 VND</h6>
    <br>
    <form action="/convert" method="post" >
        <input type="number" name="USD" >
        <input type="submit" value="CONVERT">
    </form>

    <h3>RESULT : ${convert} VND</h3>



</div>


</body>
</html>
