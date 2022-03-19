<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 3/1/2022
  Time: 4:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Check Bill</title>
</head>
<body>
<c:choose>
    <c:when test="${list !=null}">
        <table border="1">
            <tr>
                <td>Bánh mì ăn kèm</td>
            </tr>
            <c:forEach var="condiment" items="${list}">
                <tr>
                    <td>${condiment}</td>
                </tr>
            </c:forEach>
        </table>
    </c:when>
    <c:otherwise>
        <h1><a href="https://www.youtube.com/watch?v=Ztrj8UIDMQY">Bánh mì không</a></h1>
    </c:otherwise>
</c:choose>
</body>
</html>
