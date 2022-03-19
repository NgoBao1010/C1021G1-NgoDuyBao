<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 2/22/2022
  Time: 3:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Furama Resort</title>
    <link rel="icon" href="/static/image/logo.png" type="image/icon type">
    <link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
</head>
<body>
<center>
    <h1>Create Employee</h1>
    <h2>
        <a href = "/employee">List All Employee</a>
    </h2>
    <form method="post" action="/employee?action=create">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Add New Employee</h2>
            </caption>
            <tr>
                <th>Employee Name:</th>
                <td>
                    <input type="text" name="name" id="name" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Birthday:</th>
                <td>
                    <input type="date" name="birthday" id="birthday" size="45"/>
                </td>
            </tr>
            <tr>
                <th>ID Card:</th>
                <td>
                    <input type="text" name="idCard" id="idCard" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Salary:</th>
                <td>
                    <input type="text" name="salary" id="salary" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Phone:</th>
                <td>
                    <input type="text" name="phone" id="phone" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Email:</th>
                <td>
                    <input type="text" name="email" id="email" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Address:</th>
                <td>
                    <input type="text" name="address" id="address" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Position:</th>
                <td>
                    <select id="idPosition" name="idPosition">
                        <c:forEach var="type" items="${positionList}">
                            <option value="${type.idPosition}">${type.namePosition}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Education:</th>
                <td>
                    <select id="idEducation" name="idEducation">
                        <c:forEach var="type" items="${educationList}">
                            <option value="${type.idEducation}">${type.nameEducation}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Division:</th>
                <td>
                    <select id="idDivision" name="idDivision">
                        <c:forEach var="type" items="${divisionList}">
                            <option value="${type.idDivision}">${type.nameDivision}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="SAVE"/>
                </td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
