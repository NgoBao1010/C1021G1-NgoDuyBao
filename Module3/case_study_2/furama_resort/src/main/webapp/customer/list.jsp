
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
<a class="btn btn-success" href="/customer?action=create">Add new customer</a>
<table id="customer" class="table table-striped">
    <thead>
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Name</th>
        <th scope="col">Birthday</th>
        <th scope="col">Gender</th>
        <th scope="col">Id Card</th>
        <th scope="col">Phone</th>
        <th scope="col">Email</th>
        <th scope="col">Addres</th>
        <th scope="col">Customer Type</th>
        <th scope="col">Function</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach var="customer" items="${customerList}">
            <tr>
                <td >${customer.idCustomer}</td>
                <td >${customer.nameCustomer}</td>
                <td >${customer.birthday}</td>
                <td >${customer.gender ? 'Nam':'Nữ'}</td>
                <td >${customer.idCardCustomer}</td>
                <td >${customer.phoneCustomer}</td>
                <td >${customer.emailCustomer}</td>
                <td >${customer.addressCustomer}</td>
                <td >${customer.nameCustomerType}</td>
                <td>
                    <button onclick="editCustomer('${customer.idCustomer}')" type="button" class="btn btn-dark">Edit</button>
                    <button onclick="deleteCustomer('${customer.idCustomer}','${customer.nameCustomer}')" type="button" class="btn btn-danger" data-toggle="modal" data-target="#deleteModal">
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
                Are you sure delete <span class="text-danger" id="name-customer"></span> ?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                <button onclick="submitFormDelete()" type="button" class="btn btn-danger">Delete</button>
            </div>
        </div>
    </div>
</div>


<form hidden  id="form-delete" action="/customer?action=delete">
    <input type="text" name="action" value="delete">
    <input type="text" name="id" id="id-customer">
</form>

<form hidden  id="form-edit" action="/customer?action=edit">
    <input type="text" name="action" value="edit">
    <input type="text" name="id" id="editCustomer">
</form>



<script src="/static/jquery/jquery-3.5.1.min.js"></script>
<script src="/static/bootstrap413/js/popper.min.js"></script>
<script src="/static/datatables/js/jquery.dataTables.min.js"></script>
<script src="/static/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="/static/bootstrap413/js/bootstrap.min.js"></script>
<script src="/static/bootstrap413/js/bootstrap.bundle.js"></script>

<script>
    $(document).ready(function() {
        $('#customer').DataTable();
        } );
</script>
<script>
    function deleteCustomer(id, name) {
        document.getElementById("id-customer").value = id;
        document.getElementById("name-customer").innerText = name;
    }
    function submitFormDelete() {
        document.getElementById("form-delete").submit();
    }
    function editCustomer(id){
        document.getElementById("editCustomer").value = id;
        document.getElementById("form-edit").submit();
    }

</script>
</body>
</html>
