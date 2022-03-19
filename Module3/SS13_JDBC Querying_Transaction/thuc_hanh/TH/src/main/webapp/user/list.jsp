<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 2/15/2022
  Time: 2:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.11.4/css/jquery.dataTables.min.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <title>User Management Application</title>
</head>
<center>
<body>
    <h1><a href="/users">User Management</a></h1>
    <h2>
        <a href="/users?action=create">Add New User</a>
    </h2>
    <form method="post" action="/users?action=search">
        <input type="text" name="search">
        <input type="submit" value="SEARCH">
    </form>
    <table border="1" cellpadding="5" id="list" class="table table-striped table-bordered" style="width:70%">
        <caption><h2>List User</h2></caption>
        <thead>
        <tr style="background-color: aqua;color: black">
            <th>ID</th>
            <th>NAME</th>
            <th>EMAIL</th>
            <th>COUNTRY</th>
            <th>ACTIONS</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="user" items="${userList}">
            <tr style="text-align: center">
                <td>${user.getId()}</td>
                <td>${user.getName()}</td>
                <td>${user.getEmail()}</td>
                <td>${user.getCountry()}</td>
                <td style="text-align: center">
                    <a href="/users?action=edit&id=${user.getId()}" style="text-align: center"><i class="material-icons" style="font-size:36px;color:red">edit</i></a>
                    <a href="/users?action=delete&id=${user.getId()}"style="text-align: center"><i class="material-icons" style="font-size:36px;color:red">delete_forever</i></a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
    <script src="https://code.jquery.com/jquery-3.5.1.js"> </script>
    <script src="https://cdn.datatables.net/1.11.4/js/jquery.dataTables.min.js"></script>
    <script src="https://cdn.datatables.net/1.11.4/js/dataTables.bootstrap4.min.js"></script>
    <script>
        $(document).ready(function() {
            $('#list').DataTable();
        } );
    </script>
</center>
</html>
