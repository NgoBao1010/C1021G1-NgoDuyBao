<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 2/22/2022
  Time: 9:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Furama Resort</title>
    <link rel="icon" href="/static/image/logo.png" type="image/icon type">
    <link rel="stylesheet" href="/static/bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="/static/datatables/css/dataTables.bootstrap4.min.css">
</head>
<body>
    <a class="btn btn-success" href="/service?action=create">Add new Service</a>
    <table id="service" class="table table-striped">
        <thead>
        <tr>
            <th scope="col">Id</th>
            <th scope="col">Name</th>
            <th scope="col">Area</th>
            <th scope="col">Cost</th>
            <th scope="col">Max People</th>
            <th scope="col">Standard Room</th>
            <th scope="col">Description</th>
            <th scope="col">Pool Area</th>
            <th scope="col">Number of Floors</th>
            <th scope="col">Service Type</th>
            <th scope="col">Rent Type</th>
            <th scope="col">Rent Type Cost</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="service" items="${serviceList}">
            <tr>
                <td >${service.idService}</td>
                <td >${service.nameService}</td>
                <td >${service.areaService}</td>
                <td >${service.costService}</td>
                <td >${service.maxPeople}</td>
                <td >${service.roomStandard}</td>
                <td >${service.description}</td>
                <td >${service.poolArea}</td>
                <td >${service.numberOfFloors}</td>
                <td >${service.nameServiceType}</td>
                <td >${service.nameRentType}</td>
                <td >${service.costRentType}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>


    <script src="/static/jquery/jquery-3.5.1.min.js"></script>
    <script src="/static/bootstrap413/js/popper.min.js"></script>
    <script src="/static/datatables/js/jquery.dataTables.min.js"></script>
    <script src="/static/datatables/js/dataTables.bootstrap4.min.js"></script>
    <script src="/static/bootstrap413/js/bootstrap.min.js"></script>
    <script src="/static/bootstrap413/js/bootstrap.bundle.js"></script>

    <script>
        $(document).ready(function() {
            $('#service').DataTable();
        } );
    </script>
</body>
</html>
