<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 2/22/2022
  Time: 10:00 AM
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
    <h1>Create Service</h1>
    <h2>
        <a href = "/service">List All Service</a>
    </h2>
    <form method="post" action="/service?action=create">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Add New Service</h2>
            </caption>
            <tr>
                <th>Service Name:</th>
                <td>
                    <input type="text" name="name" id="name" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Area:</th>
                <td>
                    <input type="date" name="area" id="area" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Cost:</th>
                <td>
                    <input type="text" name="cost" id="cost" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Max People:</th>
                <td>
                    <input type="text" name="maxPeople" id="maxPeople" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Standard Room:</th>
                <td>
                    <input type="text" name="room" id="room" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Description:</th>
                <td>
                    <input type="text" name="description" id="description" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Pool Area:</th>
                <td>
                    <input type="text" name="poolArea" id="poolArea" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Floor:</th>
                <td>
                    <input type="text" name="floor" id="floor" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Rent Type:</th>
                <td>
                    <select id="idRentType" name="idRentType">
                        <c:forEach var="type" items="${rentTypeList}">
                            <option value="${type.idRentType}">${type.nameRentType}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Service Type:</th>
                <td>
                    <select id="idServiceType" name="idServiceType">
                        <c:forEach var="type" items="${serviceTypeList}">
                            <option value="${type.idServiceType}">${type.nameServiceType}</option>
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
