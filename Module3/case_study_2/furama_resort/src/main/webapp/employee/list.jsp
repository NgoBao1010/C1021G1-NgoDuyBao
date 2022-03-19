<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 2/22/2022
  Time: 10:59 AM
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
<a class="btn btn-success" href="/employee?action=create">Add new employee</a>
<table id="employee" class="table table-striped">
    <thead>
        <tr>
            <th scope="col">Id</th>
            <th scope="col">Name</th>
            <th scope="col">Birthday</th>
            <th scope="col">Id Card</th>
            <th scope="col">Salary</th>
            <th scope="col">Phone</th>
            <th scope="col">Email</th>
            <th scope="col">Address</th>
            <th scope="col">Position</th>
            <th scope="col">Education Degree</th>
            <th scope="col">Division</th>
            <th scope="col">Function</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="employee" items="${employeeList}">
            <tr>
                <td >${employee.idEmployee}</td>
                <td >${employee.nameEmployee}</td>
                <td >${employee.birthday}</td>
                <td >${employee.idCardEmployee}</td>
                <td >${employee.salary}</td>
                <td >${employee.phoneEmployee}</td>
                <td >${employee.emailEmployee}</td>
                <td >${employee.addressEmployee}</td>
                <td >${employee.namePosition}</td>
                <td >${employee.nameEducation}</td>
                <td >${employee.nameDivision}</td>
                <td>
                    <button onclick="editEmployee('${employee.idEmployee}')" type="button" class="btn btn-dark">Edit</button>
                    <button onclick="deleteEmployee('${employee.idEmployee}','${employee.nameEmployee}')" type="button" class="btn btn-danger" data-toggle="modal" data-target="#deleteModal">
                        Delete
                    </button>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>


<!-- Modal -->
<div class="modal fade" id="deleteModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                Are you sure delete <span class="text-danger" id="name-employee"></span> ?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                <button onclick="submitFormDelete()" type="button" class="btn btn-danger">Delete</button>
            </div>
        </div>
    </div>
</div>


<form hidden  id="form-delete" action="/employee?action=delete">
    <input type="text" name="action" value="delete">
    <input type="text" name="id" id="id-employee">
</form>

<form hidden  id="form-edit" action="/employee?action=edit">
    <input type="text" name="action" value="edit">
    <input type="text" name="id" id="editEmployee">
</form>



<script src="/static/jquery/jquery-3.5.1.min.js"></script>
<script src="/static/bootstrap413/js/popper.min.js"></script>
<script src="/static/datatables/js/jquery.dataTables.min.js"></script>
<script src="/static/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="/static/bootstrap413/js/bootstrap.min.js"></script>
<script src="/static/bootstrap413/js/bootstrap.bundle.js"></script>


<script>
    $(document).ready(function() {
        $('#employee').DataTable();
    } );

    function deleteEmployee(id, name) {
        document.getElementById("id-employee").value = id;
        document.getElementById("name-employee").innerText = name;
    }
    function submitFormDelete() {
        document.getElementById("form-delete").submit();
    }
    function editEmployee(id){
        document.getElementById("editEmployee").value = id;
        document.getElementById("form-edit").submit();
    }

</script>
</body>
</html>
