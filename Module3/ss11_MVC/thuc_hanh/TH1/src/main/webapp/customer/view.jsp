<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 2/11/2022
  Time: 3:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>View Customer</title>
</head>
<body>
    <h1>View customer</h1>
    <p>
        <a href="/customers">Back to customer list</a>
    </p>
    <table>
        <tr>
            <td>Name: </td>
            <td>${requestScope["customer"].getName()}</td>
        </tr>
        <tr>
            <td>Email: </td>
            <td>${requestScope["customer"].getEmail()}</td>
        </tr>
        <tr>
            <td>Address: </td>
            <td>${requestScope["customer"].getAddress()}</td>
        </tr>
    </table>
</body>
</html>
