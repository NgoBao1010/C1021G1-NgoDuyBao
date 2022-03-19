<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 2/28/2022
  Time: 9:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form method="post">
    <input type="text" name="rate" value="23000" readonly>
    <input type="text" name="usd" placeholder="input here">
    <input type="submit" value="Convert">
</form>

    <h1>Result: ${vnd}</h1>
</body>
</html>
