<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 2/10/2022
  Time: 10:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>List Customer</h2>
<table border="1">
    <tr>
        <th>Tên</th>
        <th>Ngày Sinh</th>
        <th>Địa Chỉ</th>
        <th>Ảnh</th>
    </tr>
    <c:forEach  var="Customer" items="${action}">
        <tr>
            <td>${Customer.name}</td>
            <td>${Customer.dayOfBirth}</td>
            <td>${Customer.address}</td>
            <td><img src="${Customer.picture}" alt="" width="100px"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
