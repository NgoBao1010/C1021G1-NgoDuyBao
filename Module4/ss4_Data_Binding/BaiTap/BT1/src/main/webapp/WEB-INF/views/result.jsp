<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 3/2/2022
  Time: 3:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<center>
<body>
    <h2>Result</h2>
    <table>
        <tr>
            <td>Language:</td>
            <td>${language}</td>
        </tr>
        <tr>
            <td>Page Size:</td>
            <td>${pageSize}</td>
        </tr>
        <tr>
            <td>Spams filter:</td>
            <td>${spamsFilter ? "Enable" : "Unable"}</td>
        </tr>
        <tr>
            <td>Signature:</td>
            <td>${signature}</td>
        </tr>
    </table>
</body>
</center>
</html>
