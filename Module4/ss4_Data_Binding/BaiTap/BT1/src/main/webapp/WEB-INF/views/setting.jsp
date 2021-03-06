<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <title>Settings</title>
</head>
<center>
<body>
    <h1>Settings</h1>
    <form:form method="post" action="result" modelAttribute="mailbox">
        <table>
            <tr>
                <td> <form:label path="language">Language</form:label></td>
                <td>
                <form:select path="language">
                    <form:option value="English">English</form:option>
                    <form:option value="Vietnamese">Vietnamese</form:option>
                    <form:option value="Japanese">Japanese</form:option>
                    <form:option value="Chinese">Chinese</form:option>
                </form:select>
                </td>
            </tr>
            <tr>
                <td><form:label path="pageSize">Page Size</form:label></td>
                <td>
                    Show <form:select path="pageSize">
                    <form:option value="5">5</form:option>
                    <form:option value="10">10</form:option>
                    <form:option value="15">15</form:option>
                    <form:option value="25">25</form:option>
                    <form:option value="50">50</form:option>
                    <form:option value="100">100</form:option>
                </form:select> emails per page
                </td>
            </tr>
            <tr>
                <td><form:label path="spamsFilter">Spams filter:</form:label></td>
                <td><form:checkbox path="spamsFilter" />Enable spams filter</td>
            </tr>
            <tr>
                <td><form:label path="signature">Signature</form:label></td>
                <td><form:textarea path="signature" /></td>
            </tr>
            <tr>
                <td><input type="submit" value="Update"></td>
                <td><input type="reset" value="Cancel"></td>
            </tr>
        </table>
    </form:form>
</body>
</center>
</html>
