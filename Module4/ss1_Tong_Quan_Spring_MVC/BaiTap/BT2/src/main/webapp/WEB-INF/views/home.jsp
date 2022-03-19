<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 2/28/2022
  Time: 9:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Translate</title>
</head>
<body>
    <form method="post">
        <input type="text" name="input">
        <input type="submit" value="Translate">
    </form>
    <h1>Result: ${result != null ?result:message}</h1>
</body>
</html>
